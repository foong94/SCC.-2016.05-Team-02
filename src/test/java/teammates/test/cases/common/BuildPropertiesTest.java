package teammates.test.cases.common;

import org.testng.annotations.Test;

import teammates.common.util.Config;
import teammates.test.cases.BaseTestCase;

public class BuildPropertiesTest extends BaseTestCase {

    @Test
    public void checkPresence() {
        assertNotNull(Config.APP_URL);
        assertTrue(Config.PERSISTENCE_CHECK_DURATION >= 0);
    }

}
