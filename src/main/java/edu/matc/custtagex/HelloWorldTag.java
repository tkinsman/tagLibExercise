package edu.matc.custtagex;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.SimpleTagSupport;
import java.io.IOException;
import java.util.Calendar;
import java.util.Date;

/**
 * Created by toddkinsman on 10/25/16.
 */
public class HelloWorldTag extends SimpleTagSupport {

    @Override
    public void doTag() throws JspException, IOException {
        super.doTag();

        double hours;

        Calendar c = Calendar.getInstance();
        Date today = c.getTime();

        int month = 9;
        int dayOfMonth = 31;

        c.set(Calendar.MONTH, month);
        c.set(Calendar.DAY_OF_MONTH, dayOfMonth);

        Date dateSpecified = c.getTime();

        hours= c.get(Calendar.HOUR_OF_DAY);

        JspWriter out = getJspContext().getOut();

        if(hours >= 0 && hours < 12) {

        } else if (hours >= 12.0 && hours < 17.0) {
            out.println("Good Afternoon!");

        } else if ( hours >= 17.0 && hours < 24.0) {
            out.println("Good Evening!");

        } else {
            out.println("Greetings!");
        }

        if (today.equals(dateSpecified)) {
            out.println("Happy Halloween!");
        }

    }
}
