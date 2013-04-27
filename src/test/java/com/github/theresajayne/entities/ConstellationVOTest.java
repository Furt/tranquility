package com.github.theresajayne.entities;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static junit.framework.Assert.assertEquals;
import static junit.framework.TestCase.assertNotNull;

/**
 * Created with IntelliJ IDEA.
 * User: Theresa
 * Date: 27/04/13
 * Time: 18:51
 * To change this template use File | Settings | File Templates.
 */
public class ConstellationVOTest {
    @Test
    public void canCreateAConstellation()
    {
        ConstellationVO constellationVO = new ConstellationVO();
        assertNotNull(constellationVO);
    }

    @Test
    public void constellationHasAName()
    {
        ConstellationVO constellationVO = new ConstellationVO();
        constellationVO.setName("Geminate");
        assertEquals("Geminate", constellationVO.getName());
    }

    @Test
    public void constellationHasSystems()
    {
        ConstellationVO constellationVO = new ConstellationVO();
        SystemVO systemVO = new SystemVO();
        List<SystemVO> systemList = new ArrayList<SystemVO>();
        systemList.add(systemVO);
        constellationVO.setSystems(systemList);
        assertEquals(systemList,constellationVO.getSystems());
    }
}