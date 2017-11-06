package ru.nik66.practice4;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

public class UncloseSin extends FilterInputStream {
    public UncloseSin(InputStream in) {
        super(in);
    }

    @Override
    public void close() throws IOException {
        // NOP
    }
}
