package itau.com.cadastro.Ninja;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class Controller {

    @GetMapping("/boas vindas")
    public String boasVinda () {
        return "Essa e minha primeira mensagem nessa rota";
    }
}
