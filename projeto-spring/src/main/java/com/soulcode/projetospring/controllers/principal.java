package com.soulcode.projetospring.controllers;
import com.soulcode.projetospring.models.Chamado;
import com.soulcode.projetospring.models.Técnico;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;

@Controller
public class principal {

    @GetMapping("/")
    public String index(Model model) {
        model.addAttribute("title", "Página Principal");
        return "index";
    }

    @GetMapping("/usuario")
    public String usuario(Model model) {
        model.addAttribute("title", "login do Usuário");
        return "loginusuario";
    }

    @GetMapping("/tecnico")
    public String tecnico(Model model) {
        model.addAttribute("title", "login do tecnico");
        return "logintecnico";
    }

    @GetMapping("/telausuario")
    public String telaUsuario(@RequestParam("username") String username, Model model) {
        List<Chamado> chamados = new ArrayList<>();
        chamados.add(new Chamado("Suporte técnico", "Internet lenta","Alta","22-04-2024"));
        chamados.add(new Chamado("Administrativo", "Emissão da 2º via de fatura","Médio","21-04-2024"));
        chamados.add(new Chamado("Juridico", "2º via de contrato ","Baixo","21-04-2024"));
        chamados.add(new Chamado("Comercial", "Criar proposta para up grande de serviços","Médio","19-04-2024"));
        chamados.add(new Chamado("Financeiro", "Criar lote de pagamentos","Alto","17-04-2024"));

        model.addAttribute("userName", username);
        model.addAttribute("title", "Tela do Usuário");
        model.addAttribute("chamados", chamados);


        return "telausuario";

    }

    @GetMapping("/telatecnico")
    public String telaTecnico (@RequestParam("username") String username, Model model) {
        List<Chamado> chamados = new ArrayList<>();
         Técnico t1 = new Técnico("Antonia");
         Técnico t2 = new Técnico("Fernanda");
         Técnico t3 = new Técnico("Sandra");

        chamados.add(new Chamado("Suporte técnico", "Internet lenta","Alta","22-04-2024",t1));
        chamados.add(new Chamado("Administrativo", "Emissão da 2º via de fatura","Médio","21-04-2024",t2));
        chamados.add(new Chamado("Juridico", "2º via de contrato ","Baixo","21-04-2024",t2));
        chamados.add(new Chamado("Comercial", "Criar proposta para up grande de serviços","Médio","19-04-2024",t3));
        chamados.add(new Chamado("Financeiro", "Criar lote de pagamentos","Alto","17-04-2024",t1));


        model.addAttribute("title","Tela do Técnico");
        model.addAttribute("chamados", chamados);


        return "telatecnico";

    }




    }



