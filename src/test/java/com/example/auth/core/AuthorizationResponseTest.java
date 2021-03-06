package com.example.auth.core;

import com.example.auth.core.authorization.AuthorizationResponse;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

/**
 * @author Ivan Stefanov <ivan.stefanov@clouway.com>
 */
public class AuthorizationResponseTest {
  @Test
  public void buildRedirectURI() throws Exception {
    AuthorizationResponse response = new AuthorizationResponse("123456789", "currentPage", "http://abv.bg/auth");

    assertThat(response.buildURI(), is("http://abv.bg/auth?code=123456789&state=currentPage"));
  }

  @Test
  public void buildAnotherRedirectURI() throws Exception {
    AuthorizationResponse response = new AuthorizationResponse("987654321", "currentPage", "http://zazz.bg/");

    assertThat(response.buildURI(), is("http://zazz.bg/?code=987654321&state=currentPage"));
  }
}