package com.ibanfr.liftbutton;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

class LiftTest {

    //TEST LIST
    //[x] - doors should be CLOSED when Lift is created
    //[x] - should switch lights ON when button is pressed and doors are CLOSED
    //[] - should OPEN the lift doors when lift arrives
    //[] - should switch OFF the lights when lift arrives
    //[] - lights should be OFF when button is pressed and doors are OPEN

    @Test
    @DisplayName("should create a new Lift")
    void should_create_a_new_Lift() {

        assertThat(new Lift())
                .as("Lift should be created")
                .isNotNull();
    }

    @Test
    @DisplayName("doors should be CLOSED when Lift is created")
    void doorsShouldBeClosedWhenLiftIsCreated() {
        var lift = new Lift();
        assertEquals("OPEN", lift.doors());
    }

    @Test
    @DisplayName("should switch lights ON when button is pressed and doors are CLOSED")
    void shouldSwitchLightsOnWhenButtonIsPressedAndDoorsAreClosed() {
        var lift = new Lift();
        lift.pressButton();
        assertAll(
                () -> assertEquals(true, lift.light()),
                () -> assertEquals("OPEN", lift.doors())
        );
    }
}
