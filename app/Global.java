import models.ConhecimentoJava;
import models.ConhecimentoJavaHelper;
import models.InteressadoHelper;
import play.Application;
import play.GlobalSettings;
import play.Logger;


public class Global extends GlobalSettings {
	
	@Override
    public void onStart(final Application app) {
        Logger.info("Aplicação inicializada...");
        ConhecimentoJavaHelper.salvar(new ConhecimentoJava(1, "Não tenho conhecimento"));
        ConhecimentoJavaHelper.salvar(new ConhecimentoJava(2,"Sei o que é mas nunca utilizei"));
        ConhecimentoJavaHelper.salvar(new ConhecimentoJava(3,"Sei o básico"));
        ConhecimentoJavaHelper.salvar(new ConhecimentoJava(4,"Sei programar bem na linguagem"));
    }

    public void onStop(Application app) {
        Logger.info("Aplicação finalizada");
    }

}
