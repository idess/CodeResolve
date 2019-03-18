package pe.idess.coderesolve;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import pe.idess.coderesolve.test20190318.CodeResolve20190318;

@Slf4j
@SpringBootApplication
public class CoderesolveApplication {

    public static void main(String[] args) {
        SpringApplication.run(CoderesolveApplication.class, args);

        CodeResolve20190318 codeResolve20190318 = new CodeResolve20190318();
        int input20190318_1[] = {-1, 3, -1, 5};
        int output20180318 = codeResolve20190318.resolve(input20190318_1);
        log.info("CodeResolve20190318 input {} : output {}", input20190318_1, output20180318);

        int input20190318_2[] = {-5, -3, -1};
        output20180318 = codeResolve20190318.resolve(input20190318_2);
        log.info("CodeResolve20190318 input {} : output {}", input20190318_2, output20180318);

        int input20190318_3[] = {2, 4, -2, -3, 8};
        output20180318 = codeResolve20190318.resolve(input20190318_3);
        log.info("CodeResolve20190318 input {} : output {}", input20190318_3, output20180318);
    }

}
