package homework.day4.playground.processors;

import homework.day4.playground.essence.creatures.Crawlable;
import homework.day4.playground.utils.DirectionGenerator;
import homework.day4.playground.utils.DistanceGenerator;

public class CrawlableProcessor {

    public void runCrawlable(Crawlable crawlable) {

        String direction = DirectionGenerator.generateDirection();
        int distance = DistanceGenerator.generateDistance();
        crawlable.crawl(direction, distance);
    }

    public void runCrawlable(Crawlable crawlable, String direction) {

        int randomDistance = DistanceGenerator.generateDistance();
        crawlable.crawl(direction, randomDistance);

    }

    public void runCrawlable(Crawlable crawlable, String direction, int distance) {

        crawlable.crawl(direction, distance);
    }

}
