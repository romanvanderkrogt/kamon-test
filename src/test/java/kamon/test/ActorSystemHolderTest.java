package kamon.test;

import akka.actor.ActorSystem;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 *
 * @author Oleg Kurbatov &lt;oleg.kurbatov@nitka.com&gt;
 */
@Test
@ContextConfiguration(locations = "file:src/main/webapp/WEB-INF/context.xml")
public class ActorSystemHolderTest extends AbstractTestNGSpringContextTests {
    
    @Autowired
    private ActorSystemHolder actorSystemHolder;
    
    public void getActorSystemTest() {
        assertNotNull(actorSystemHolder.getActorSystem()); // fail
    }
    
    public void testActorSystem() {
         ActorSystem actorSystem = ActorSystem.create("TestActorSystem");
         assertNotNull(actorSystem); // pass
    }
    
}
