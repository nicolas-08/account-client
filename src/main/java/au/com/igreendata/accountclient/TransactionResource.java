package au.com.igreendata.accountclient;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping(value="/rest/transaction/client")
public class TransactionResource {
	
	@Autowired
	private RestTemplate restTemplate;
	
	@Autowired
	TransactionServiceProxy transactionServiceProxy;
	
	@GetMapping
	public String transaction() {
		
		String response = transactionServiceProxy.getTransactions();
		return response;
	}

}
	