package pe.idess.coderesolve;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import pe.idess.coderesolve.test20190317.CodeResolve20190317;
import pe.idess.coderesolve.test20190318.CodeResolve20190318;

@Slf4j
@SpringBootApplication
public class CoderesolveApplication {

    public static void main(String[] args) {
        SpringApplication.run(CoderesolveApplication.class, args);

        CodeResolve20190317 codeResolve20190317 = new CodeResolve20190317();

        CodeResolve20190318 codeResolve20190318 = new CodeResolve20190318();
        codeResolve20190318.resolve(12);
    }

}
