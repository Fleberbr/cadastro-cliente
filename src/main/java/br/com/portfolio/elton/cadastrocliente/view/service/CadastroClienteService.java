package br.com.portfolio.elton.cadastrocliente.view.service;


import br.com.portfolio.elton.cadastrocliente.model.Pessoa;
import br.com.portfolio.elton.cadastrocliente.view.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



/* O Spring vai entender isso como notação como um serviço.
Service vai ser criado como um singleton (1 instancia apenas para o projeto inteiro).*/
//o package service e reposity devem ser singleton, para não termos problema de memória.
@Service
public class CadastroClienteService {

    @Autowired //O spring cria todos os serviço na memoria da maquina, para poder usar esse serviço se uma o Autowired para requisitar o uso dessa instancia. padrão singleton usa um serviço só, não preisa instanciar um novo "new CadastroClienteservice"
    private ClienteRepository clienteRepository;
    public Pessoa cadastroCliente(Pessoa pessoa) {
        if (pessoa == null || pessoa.getEndereco() == null){
            throw new RuntimeException("Pessoa e endereço devem ser enviados.");
        }
        return clienteRepository.save(pessoa);
    }
}
