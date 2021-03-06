import models.ConhecimentoJava;
import models.ConhecimentoJavaHelper;
import models.InteressadoHelper;
import play.Application;
import play.GlobalSettings;
import play.Logger;

import java.util.List;
import java.util.Optional;


public class Global extends GlobalSettings {
	
	@Override
    public void onStart(final Application app) {
        Logger.info("Aplicação inicializada...");

        List<ConhecimentoJava> list = ConhecimentoJava.find.findList();
        if (list.size() == 0) {
            ConhecimentoJavaHelper.salvar(new ConhecimentoJava(1L, "Não tenho conhecimento"));
            ConhecimentoJavaHelper.salvar(new ConhecimentoJava(2L, "Básico"));
            ConhecimentoJavaHelper.salvar(new ConhecimentoJava(3L, "Intermediário"));
            ConhecimentoJavaHelper.salvar(new ConhecimentoJava(4L, "Avançado"));
        }
    }

    public void onStop(Application app) {
        Logger.info("Aplicação finalizada");
    }

}
