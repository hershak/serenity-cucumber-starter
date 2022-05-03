package starter.search;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class WikipediaArticle {
    //public static final Target HEADING =  Target.the("article identifier").locatedBy("p.mw-search-createlink a");
    public static final Target HEADING =  Target.the("article identifier").located(By.id("firstHeading"));
}
