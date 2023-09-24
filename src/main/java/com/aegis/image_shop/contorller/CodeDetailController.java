package com.aegis.image_shop.contorller;

import com.aegis.image_shop.domain.CodeDetail;
import com.aegis.image_shop.dto.CodeLabelValue;
import com.aegis.image_shop.service.CodeDetailService;
import com.aegis.image_shop.service.CodeService;
import lombok.RequiredArgsConstructor;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;


@RequiredArgsConstructor
@Controller
@RequestMapping("/codedetail")
@PreAuthorize("hasRole('ADMIN')")
public class CodeDetailController {

    private final CodeDetailService codeDetailService;

    private final CodeService codeService;

    //등록 화면
    @GetMapping("/register")
    public void registerForm(Model model) throws Exception{
        CodeDetail codeDetail = new CodeDetail();
        model.addAttribute(codeDetail);

        List<CodeLabelValue> groupCodeList = codeService.getGroupCodeList();
        model.addAttribute("groupCodeList", groupCodeList);
    }

    // 등록 처리
    public String register(@Validated CodeDetail codeDetail, BindingResult result,
                           RedirectAttributes rttr, Model model) throws Exception{
        if(result.hasErrors()){
            List<CodeLabelValue> groupCodeList = codeService.getGroupCodeList();
            model.addAttribute("groupCodeList", groupCodeList);
            return "codedetail/register";
        }

        codeDetailService.register(codeDetail);

        rttr.addFlashAttribute("msg", "SUCCESS");
        return "redirect:/codedetail/list";
    }

    // 목록 화면
    @GetMapping("/list")
    public void list(Model model) throws Exception{
        model.addAttribute("list", codeDetailService.list());
    }

    // 상세 화면
    @GetMapping("/read")
    public void read(CodeDetail codeDetail, Model model) throws Exception{
        model.addAttribute(codeDetailService.read(codeDetail));
        List<CodeLabelValue> groupCodeList = codeService.getGroupCodeList();
        model.addAttribute("groupCodeList", groupCodeList);
    }

    // 수정 처리
    @PostMapping("/modify")
    public String modify(@Validated CodeDetail codeDetail, BindingResult result, RedirectAttributes rttr, Model model) throws Exception{
        if(result.hasErrors()){
            List<CodeLabelValue> groupCodeList = codeService.getGroupCodeList();
            model.addAttribute("groupCodeList", groupCodeList);
            return "codedetail/modify";
        }

        codeDetailService.modify(codeDetail);

        rttr.addFlashAttribute("msg", "SUCCESS");
        return "redirect:/codedetail/list";
    }

    // 삭제 처리
    @PostMapping("/remove")
    public String remove(CodeDetail codeDetail, RedirectAttributes rttr) throws Exception{
        codeDetailService.remove(codeDetail);

        rttr.addFlashAttribute("msg", "SUCCESS");
        return "redirect:/codedetail/list";
    }
}
