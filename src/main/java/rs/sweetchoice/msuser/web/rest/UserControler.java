package rs.sweetchoice.msuser.web.rest;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RestController;
import rs.sweetchoice.msuser.service.UserService;

@RestController
@RequiredArgsConstructor
public class UserControler {

    //TODO: expose necessary API's

    private final UserService userService;

}
