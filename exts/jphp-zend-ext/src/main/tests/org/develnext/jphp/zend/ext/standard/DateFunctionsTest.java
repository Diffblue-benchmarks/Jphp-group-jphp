package org.develnext.jphp.zend.ext.standard;

import org.develnext.jphp.zend.ZendJvmTestCase;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.junit.runners.MethodSorters;

@RunWith(JUnit4.class)
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class DateFunctionsTest extends ZendJvmTestCase {

    @Test
    public void dateDefaultTimezoneGet() {
        check("ext/date/date_default_timezone_get-2.phpt");
        check("ext/date/date_default_timezone_get-3.phpt");
        check("ext/date/date_default_timezone_get-4.phpt");
    }

    @Test
    public void dateDefaultTimezoneSet() {
        check("ext/date/date_default_timezone_set_error.phpt");
    }

    @Test
    public void testlocaltime() {
        check("ext/date/007.phpt");
        check("ext/date/localtime_basic.phpt");
        check("ext/date/localtime_variation4.phpt");
        check("ext/date/localtime_variation5.phpt");
    }

    @Test
    public void testMkTime() {
        check("ext/date/bug21966.phpt");
        check("ext/date/gmmktime_basic.phpt");
        check("ext/date/mktime_basic1.phpt");
    }
}