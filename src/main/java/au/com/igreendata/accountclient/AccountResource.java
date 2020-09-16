package au.com.igreendata.accountclient;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping(value="/rest/account/client")
public class AccountResource {

    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    AccountServiceProxy accountServiceProxy;

    @GetMapping
    public String account() {

        String response = accountServiceProxy.getAccounts();
        return response;
    }
}
