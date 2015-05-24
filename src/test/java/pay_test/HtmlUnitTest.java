package pay_test;

import java.io.IOException;

import com.gargoylesoftware.htmlunit.FailingHttpStatusCodeException;
import com.gargoylesoftware.htmlunit.WebClient;
import com.gargoylesoftware.htmlunit.html.HtmlPage;

public class HtmlUnitTest {

	public static void main(String args[]){
		WebClient webclient = new WebClient();
		try {
			webclient.getOptions().setJavaScriptEnabled(false);
			webclient.getOptions().setCssEnabled(false);
			
			HtmlPage page = webclient.getPage("https://auth.alipay.com/login/enterprise.htm?redirectType=parent&goto=");
			String content = page.asText();
			
			System.out.println(content);
		} catch (FailingHttpStatusCodeException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		webclient.close();
	}
}
