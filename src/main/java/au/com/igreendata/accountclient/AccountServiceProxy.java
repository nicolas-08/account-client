package au.com.igreendata.accountclient;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(name="account-list-service" )
public interface AccountServiceProxy {
	
	   @RequestMapping("/rest/account-list/server")
	   public String getAccounts();
	   

}
