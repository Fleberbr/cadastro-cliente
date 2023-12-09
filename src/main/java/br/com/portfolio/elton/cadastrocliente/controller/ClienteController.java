package br.com.portfolio.elton.cadastrocliente.controller;

import br.com.portfolio.elton.cadastrocliente.model.Pessoa;
import br.com.portfolio.elton.cadastrocliente.view.service.CadastroClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


//O CONTROLER é o ENTRE POINT da nossa aplicação.

//Usado para declarar para o spring que essa classe é um controlador.
@RestController
//Usado para declarar para o spring qual o path http.
@RequestMapping("/clientes")
public class ClienteController {

    @Autowired  //O spring cria todos os serviço na memoria da maquina, para poder usar esse serviço se uma o Autowired para requisitar o uso dessa instancia. padrão singleton usa um serviço só, não preisa instanciar um novo "new CadastroClienteservice"
    private CadastroClienteService cadastroClienteService;

    /**
     * Usado para retornar algum texto.
     * @return String
     */
    @GetMapping("/mensagem")
    public String mensagem(){
        return "hello Luizão";
    }

    /**
     * Criando um método post, o acionamento é via Insomnia criando um JSON, ao retonar o Objeto ele dá um retorno via Insomnia por JSON.
     * @return String
     */
    @PostMapping("/cadastrar")
    public Pessoa cadastrarCliente(@RequestBody Pessoa pessoa){
        return cadastroClienteService.cadastroCliente(pessoa);
    }

}
