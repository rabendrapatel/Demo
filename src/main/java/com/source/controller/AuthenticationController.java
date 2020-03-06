package com.source.controller;

import com.source.config.JwtTokenUtil;
import com.source.enums.RespStatus;
import com.source.request.AuthenticationRequest;
import com.source.response.GenricResponse;
import com.source.response.Response;
import com.source.service.AuthenticationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.DisabledException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
@RequestMapping("/authentication")
public class AuthenticationController {

	@Autowired
	private AuthenticationManager authenticationManager;

	@Autowired
	private JwtTokenUtil jwtTokenUtil;

	@Autowired
	private AuthenticationService authenticationService;

	@RequestMapping(path = "/login", method = RequestMethod.POST)
	public Response<AuthenticationRequest> getAllCountries(@RequestBody AuthenticationRequest authenticationRequest) {
		GenricResponse<AuthenticationRequest> response = new GenricResponse<AuthenticationRequest>();
		try {
			authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(
					authenticationRequest.getUserName(), authenticationRequest.getPassword()));
			final UserDetails userDetails = authenticationService.loadUserByUsername(authenticationRequest.getUserName());
			
			authenticationRequest.setToken(jwtTokenUtil.generateToken(userDetails));
			authenticationRequest.setPassword(null);
			
			return response.createSuccessResponse(authenticationRequest, "Token generated sucessfully", 200,
					RespStatus.Success.name());
			
		} catch (DisabledException e) {
			return response.createErrorResponse("User is disabled", 400, RespStatus.Failure.name());
		} catch (BadCredentialsException e) {
			return response.createErrorResponse("Invalid credentials", 400, RespStatus.Failure.name());
		} catch (Exception e) {
			return response.createErrorResponse(e.getMessage(), 500, RespStatus.Failure.name());
		}
	}
}
