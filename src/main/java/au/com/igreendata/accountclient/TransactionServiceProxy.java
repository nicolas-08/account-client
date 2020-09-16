package au.com.igreendata.accountclient;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(name="account-transaction-service" )
public interface TransactionServiceProxy {
	
	   @RequestMapping("/rest/account-transaction/server")
	   public String getTransactions();
	   

}
