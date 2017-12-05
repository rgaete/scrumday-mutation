package com.scrumday.rest.mutation.unit.controller;

import com.scrumday.rest.mutation.controller.MutationController;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class MutationControllerTest {

    @Test
    public void getMessageShouldReturnHello() throws Exception {
        MutationController mutationController = new MutationController();
        assertThat(mutationController.getMessage(), is("Hello"));
    }
}