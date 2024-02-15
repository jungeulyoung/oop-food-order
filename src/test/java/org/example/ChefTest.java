package org.example;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class ChefTest {

    @DisplayName("메뉴에 해당하는 음식을 만든다.")
    @Test
    void makeCookTest() {
        Chef chef = new Chef();
        MenuItem menuItem = new MenuItem("돈까스", 5000);

        Cook cook =  chef.makeCook(menuItem);

        assertThat(cook).isEqualTo(new Cook("돈까스", 5000));
    }
}
