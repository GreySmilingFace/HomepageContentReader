package homepageContentReader;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class TestClass {

	public static void main(String[] args) throws IOException {
		List<String> testList = new ArrayList<String>();
		List<Team> teams = new ArrayList<Team>();

		Document doc = Jsoup.connect(
				"https://bhv-handball.liga.nu/cgi-bin/WebObjects/nuLigaHBDE.woa/wa/groupPage?championship=MF+2018%2F19&group=227844")
				.get();

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

		for (Team team : teams) {
			System.out.println(team.toString());
		}

	}
}
