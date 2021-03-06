package org.apereo.cas.util;

import lombok.extern.slf4j.Slf4j;
import org.apereo.cas.oidc.util.OidcAuthorizationRequestSupport;
import org.junit.Test;

import java.util.Set;

import static org.junit.Assert.*;

/**
 * @author David Rodriguez
 * @since 5.1.0
 */
@Slf4j
public class OidcAuthorizationRequestSupportTests {

    @Test
    public void verify() {
        final String url = "https://tralala.whapi.com/something?prompt=value1";
        final Set<String> authorizationRequest = OidcAuthorizationRequestSupport.getOidcPromptFromAuthorizationRequest(url);
        assertEquals("value1", authorizationRequest.toArray()[0]);
    }
}
