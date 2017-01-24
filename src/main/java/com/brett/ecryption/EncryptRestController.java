package com.brett.ecryption;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Brett on 1/24/17.
 */
@RestController
public class EncryptRestController {
	@Autowired
	UserRepository users;
}
