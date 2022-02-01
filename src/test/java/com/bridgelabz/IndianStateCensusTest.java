package com.bridgelabz;

import com.bridgelabz.CustomExceptionService.ExceptionType;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class IndianStateCensusTest
{
    @Test
    public void givenReadDataFromIndianCensus_ShouldReturnCountDataPresentInFile()
    {
        String fileName = "/IndiaStateCensusData.csv";
        IndianStateCensusAnalyzer censusService = new IndianStateCensusAnalyzer();
        List<StateCensus> stateCencesList = censusService.readInIndiaStateCensusData(fileName);
        assertEquals(29, stateCencesList.size());
    }

    @Test
    public void givenWrongFile_ShouldReturnFileNotFound()
    {
        String fileName = "/IndiaStateCensus.csv";
        IndianStateCensusAnalyzer censusService = new IndianStateCensusAnalyzer();
        try
        {
            List<StateCensus> stateCencesList = censusService.readInIndiaStateCensusData(fileName);
            assertEquals(29, stateCencesList.size());
        }
        catch (CustomExceptionService e)
        {
            assertEquals(ExceptionType.FILE_NOT_FOUND, e.type);
        }
    }

    @Test
    public void givenWrongFileExtension_ShouldReturnWrongFileType()
    {
        String fileName = "/IndiaStateCensusData.txt";
        IndianStateCensusAnalyzer censusService = new IndianStateCensusAnalyzer();
        try
        {
            List<StateCensus> stateCencesList = censusService.readInIndiaStateCensusData(fileName);
            assertEquals(29, stateCencesList.size());
        }
        catch (CustomExceptionService e)
        {
            assertEquals(ExceptionType.WRONG_FILE_TYPE, e.type);
        }
    }

    @Test
    public void givenWrongFileHeaders_ShouldReturnWrongHeader()
    {
        String fileName = "/IndiaStateCensusDataWrongHeaders.csv";
        IndianStateCensusAnalyzer censusService = new IndianStateCensusAnalyzer();
        try
        {
            List<StateCensus> stateCencesList = censusService.readInIndiaStateCensusData(fileName);
            assertEquals(29, stateCencesList.size());
        }
        catch (CustomExceptionService e)
        {
            assertEquals(ExceptionType.WRONG_HEADER, e.type);
        }
    }
}