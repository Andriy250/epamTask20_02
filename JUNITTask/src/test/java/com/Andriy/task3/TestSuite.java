package com.Andriy.task3;

import com.Andriy.task1.*;
import org.junit.platform.suite.api.SelectPackages;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)

@Suite.SuiteClasses({CreatureTest.class,
                        MokitoTest.class})
//@SelectPackages({"com.Andriy.task1"})
public class TestSuite{

}
