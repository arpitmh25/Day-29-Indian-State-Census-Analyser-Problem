package com.bridgelabz;

import com.bridgelabz.CustomExceptionService.ExceptionType;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class IndianStateCodeTest {
    @Test
    public void givenReadDataFromIndianCensus_ShouldReturnCountDataPresentInFile() {
        String fileName = "/StateCode.csv";
        IndianStateCodeService codeService = new IndianStateCodeService();
        List<StateCode> StateCodeList = codeService.readIndiaStatCode(fileName);
        assertEquals(37, StateCodeList.size());
    }

    @Test
    public void givenWrongFile_ShouldReturnFileNotFound() {
        String fileName = "/StateCodeing.csv";
        IndianStateCodeService codeService = new IndianStateCodeService();
        try {
            List<StateCode> StateCodeList = codeService.readIndiaStatCode(fileName);
            assertEquals(37, StateCodeList.size());
        } catch (CustomExceptionService e) {
            assertEquals(ExceptionType.FILE_NOT_FOUND, e.type);
        }
    }

    @Test
    public void givenWrongFileExtention_ShouldReturnWrongFileType() {
        String fileName = "/StateCodeData.txt";
        IndianStateCodeService codeService = new IndianStateCodeService();
        try {
            List<StateCode> StateCodeList = codeService.readIndiaStatCode(fileName);
            assertEquals(37, StateCodeList.size());
        } catch (CustomExceptionService e) {
            assertEquals(ExceptionType.WRONG_FILE_TYPE, e.type);
        }
    }

    @Test
    public void givenWrongFileHeaders_ShouldReturnWrongHeader() {
        String fileName = "/IndiaStateCensusDataWrongHeaders.csv";
        IndianStateCodeService codeService = new IndianStateCodeService();
        try {
            List<StateCode> stateCodeList = codeService.readIndiaStatCode(fileName);
            assertEquals(37, stateCodeList.size());
        } catch (CustomExceptionService e) {
            assertEquals(ExceptionType.WRONG_HEADER, e.type);
        }
    }
}