package com.liumapp.workable.converter.factory;

import com.liumapp.workable.converter.config.ConverterConfig;
import org.junit.Test;

import static org.junit.Assert.*;

public class ConverterConfigManagerTest {

    @Test
    public void getParams() {
        ConverterConfig params = null;
        try {
            params = ConverterConfigManager.getInstance().getParams();
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }
        assertEquals("C:\\Program Files\\LibreOffice", params.getLibreofficePath());
        assertEquals("./data/pdf/", params.getPdfSavePath());
        assertEquals("./data/pic/", params.getPicSavePath());
        assertEquals("./data/waiting/", params.getWaitedSavePath());
    }
}