package kamon.test;

import akka.actor.ActorSystem;
import javax.annotation.PostConstruct;
import org.springframework.stereotype.Component;

/**
 *
 * @author Oleg Kurbatov &lt;oleg.kurbatov@nitka.com&gt;
 */
@Component
public class ActorSystemHolder {
    
    private ActorSystem actorSystem;

    public ActorSystemHolder() {
        // works
        actorSystem = ActorSystem.create("ConstructorTestActorSystem");
    }

    @PostConstruct
    public void init() {
        // works
        actorSystem = ActorSystem.create("PostConstructTestActorSystem");
    }
    
    public ActorSystem getActorSystem() {
        return actorSystem;
    }
    
}
