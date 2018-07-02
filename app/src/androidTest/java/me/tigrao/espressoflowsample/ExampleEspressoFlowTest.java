package me.tigrao.espressoflowsample;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.action.ViewActions.typeText;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;

import android.support.annotation.IdRes;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class ExampleEspressoFlowTest {

    private static final String EMAIL = "tigrao@gmail.com";
    private static final String PASSWORD = "12345678";

    @Rule
    public ActivityTestRule<MainActivity> rule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void shouldDoLoginAndHaveCorrectEmailHomePresentation() {
        inputValue(EMAIL, R.id.edt_email);
        inputValue(PASSWORD, R.id.edt_password);
        onView(withId(R.id.btn_login))
                .perform(click());

        onView(withId(R.id.txt_home))
                .check(matches(withText(EMAIL)));
    }

    private void inputValue(final String input, @IdRes final int id) {
        onView(withId(id))
                .perform(typeText(input));
    }

}
