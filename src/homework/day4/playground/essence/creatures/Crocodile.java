package homework.day4.playground.essence.creatures;

public class Crocodile extends Vertebrata implements Crawlable {
    public Crocodile(int mass, String name) {
        super(mass, name);
    }

    @Override
    public void crawl(String direction, int distance) {

        String crawlDirection = String.format("I am %s, my name is %s and I am crawling to %s for %s units", getClass().getSimpleName(), name, direction, distance);
        System.out.println(crawlDirection + " " + "wr-wr-wrr-r..");

    }
}
