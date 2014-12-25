package ru.unn.agile.CreditCalculator.ViewModel;

import org.hamcrest.BaseMatcher;
import org.hamcrest.Description;
import org.hamcrest.Matcher;

public class RegexMatcher extends BaseMatcher {
    private final String regularExpression;

    public boolean matches(final Object o) {
        return ((String) o).matches(regularExpression);
    }
    public RegexMatcher(final String regex) {
        this.regularExpression = regex;
    }

    public void describeTo(final Description description) {
        description.appendText("matches regex = ");
        description.appendText(regularExpression);
    }

    public static Matcher<? super String> matchesPattern(final String regularExpression) {
        RegexMatcher matcher = new RegexMatcher(regularExpression);
        //NOTE: this ugly cast is needed to workaround 'unchecked' Java warning
        @SuppressWarnings (value = "unchecked")
        Matcher<? super String> castedMatcher = (Matcher<? super String>)   matcher;
        return castedMatcher;
    }
}
