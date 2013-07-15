package com.github.theresajayne.tranquility.formbeans;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertNotNull;

/**
 * Created with IntelliJ IDEA.
 * User: Theresa
 * Date: 27/04/13
 * Time: 18:41
 */
public class RegionFBTest {

    @Test
    public void canCreateARegion()
    {
        RegionFB regionFB = new RegionFB();
        assertNotNull(regionFB);

    }

    @Test
    public void aRegionHasAName()
    {
        RegionFB regionFB = new RegionFB();
        regionFB.setName("The Forge");
        assertEquals("The Forge",regionFB.getName());
    }


}
