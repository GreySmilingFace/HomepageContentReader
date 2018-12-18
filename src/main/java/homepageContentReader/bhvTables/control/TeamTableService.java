package homepageContentReader.bhvTables.control;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.enterprise.context.RequestScoped;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import homepageContentReader.bhvTables.entity.Team;
import homepageContentReader.bhvTables.entity.URLObject;

@RequestScoped
public class TeamTableService {

	public List<Team> getTeamEntityByBHVHomepage(URLObject urlObject) {

		
		List<String> testList = new ArrayList<String>();
		List<Team> teams = new ArrayList<Team>();

		Document doc;
		try {
			doc = Jsoup.connect(urlObject.getUrl()).get();
			int counterTeams = -1; // Weil Header abgezogen werden muss

			Elements tables = doc.select("table.result-set"); // <table class="result-set">
			Elements trs = tables.get(0).select("tr");
			for (Element tr : trs) {
				counterTeams++;
				Elements tds = tr.select("td");
				for (Element td : tds) {
					if (!td.text().isEmpty())
						testList.add(td.text());
				}
			}
			for (int i = 0; i < counterTeams; i++) {
				List<String> subItems = testList.subList(0, 9);

				teams.add(new Team(subItems.get(0), subItems.get(1), subItems.get(2), subItems.get(3), subItems.get(4),
						subItems.get(5), subItems.get(6), subItems.get(7), subItems.get(8)));

				for (int k = 0; k < 9; k++) {
					testList.remove(0);
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

		return teams;

	}
}
