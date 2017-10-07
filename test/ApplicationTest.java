import models.Interessado;
import models.InteressadoHelper;
import org.junit.*;
import static org.junit.Assert.*;
import static play.test.Helpers.*;

import java.util.List;

/**
 *
 * Simple (JUnit) tests that can call all parts of a play app.
 * If you are interested in mocking a whole application, see the wiki for more details.
 *
 */
public class ApplicationTest {
	
	@Test
	public void findById() {
	    running(fakeApplication(inMemoryDatabase("test")), () -> {
	    	List<Interessado> list = InteressadoHelper.getInteressadoByEmail("danielgoncalvesti@gmail.com");
	        assertEquals("Daniel Gonçalves da Silva", list.get(0).nome);
	       // assertEquals("1984-01-24", formatted(macintosh.introduced));
	    });
	}	
	
//    @Test
//    public void simpleCheck() {
//        int a = 1 + 1;
//        assertEquals(2, a);
//    }

    
//    @Test
//    public void renderTemplate() {
//        
//    	Form<Interessado> formTest = Form.form(Interessado.class);
//        Content html = views.html.index.render("Formulário de Cadastro", formTest);
//        assertEquals("text/html", html.contentType());
//        assertTrue(html.body().contains("Curso de Scala"));
//    }


}
