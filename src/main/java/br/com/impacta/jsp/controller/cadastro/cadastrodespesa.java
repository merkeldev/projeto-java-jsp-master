package br.com.impacta.jsp.controller.cadastro;


import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Slf4j
@Controller
public class cadastrodespesa {
    @GetMapping("/cadastrodespensa")

    public String getCadastroDespesa(){
        return "/cadastro/cadastro-de-despesa";
    }


}
