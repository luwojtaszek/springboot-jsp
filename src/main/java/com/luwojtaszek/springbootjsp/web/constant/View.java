package com.luwojtaszek.springbootjsp.web.constant;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

/**
 * Stores all views paths.
 * <p>
 * Created by lukasz on 27.08.2017.
 * With IntelliJ IDEA 15
 */
@Getter
@RequiredArgsConstructor
public enum View {
    HOME(Constants.ROOT + "index");

    private final String path;

    private static class Constants {
        private static final String ROOT = "views/";

        private Constants() {
        }
    }
}
