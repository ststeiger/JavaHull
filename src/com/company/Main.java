
package com.company;

import com.fasterxml.jackson.core.type.TypeReference;
import com.vividsolutions.jts.geom.Geometry;
import com.vividsolutions.jts.geom.GeometryFactory;



import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


public class Main
{

    public static com.vividsolutions.jts.geom.Coordinate[] ToNetTopologyCoordinates(java.util.List<com.company.GeoPoint> coords) //, int z)
    {
        com.vividsolutions.jts.geom.Coordinate[] coordinates = new com.vividsolutions.jts.geom.Coordinate[coords.size()];

        int i = 0;
        for (com.company.GeoPoint thisCoordinate : coords)
        {
            // TODO: FIXME
            coordinates[i] = new com.vividsolutions.jts.geom.Coordinate((double)thisCoordinate.Latitude, (double)thisCoordinate.Longitude);
            ++i;
        }

        return coordinates;
    } // End Function ToNetTopologyCoordinates



    public static void main(String[] args) throws IOException
    {
        String a = "[[{\"Latitude\":47.0435701,\"Longitude\":8.3211035},{\"Latitude\":47.0433179,\"Longitude\":8.3214567},{\"Latitude\":47.0431221,\"Longitude\":8.3211557},{\"Latitude\":47.0433743,\"Longitude\":8.3208025},{\"Latitude\":47.0435701,\"Longitude\":8.3211035}],[{\"Latitude\":47.0432071,\"Longitude\":8.3214196},{\"Latitude\":47.0431851,\"Longitude\":8.3213865},{\"Latitude\":47.0432053,\"Longitude\":8.3213582},{\"Latitude\":47.0431253,\"Longitude\":8.3212348},{\"Latitude\":47.0429550,\"Longitude\":8.3214726},{\"Latitude\":47.0429757,\"Longitude\":8.3215046},{\"Latitude\":47.0429430,\"Longitude\":8.3215503},{\"Latitude\":47.0429219,\"Longitude\":8.3215177},{\"Latitude\":47.0428485,\"Longitude\":8.3216201},{\"Latitude\":47.0428713,\"Longitude\":8.3216552},{\"Latitude\":47.0428418,\"Longitude\":8.3216964},{\"Latitude\":47.0428117,\"Longitude\":8.3217385},{\"Latitude\":47.0427892,\"Longitude\":8.3217038},{\"Latitude\":47.0427201,\"Longitude\":8.3218004},{\"Latitude\":47.0427483,\"Longitude\":8.3218440},{\"Latitude\":47.0426922,\"Longitude\":8.3219224},{\"Latitude\":47.0426725,\"Longitude\":8.3218920},{\"Latitude\":47.0424997,\"Longitude\":8.3221332},{\"Latitude\":47.0425937,\"Longitude\":8.3222748},{\"Latitude\":47.0427034,\"Longitude\":8.3221208},{\"Latitude\":47.0432071,\"Longitude\":8.3214196}],[{\"Latitude\":47.0434380,\"Longitude\":8.3217293},{\"Latitude\":47.0434675,\"Longitude\":8.3216879},{\"Latitude\":47.0433343,\"Longitude\":8.3214835},{\"Latitude\":47.0432882,\"Longitude\":8.3215481},{\"Latitude\":47.0432632,\"Longitude\":8.3215098},{\"Latitude\":47.0427628,\"Longitude\":8.3222120},{\"Latitude\":47.0427034,\"Longitude\":8.3221208},{\"Latitude\":47.0425937,\"Longitude\":8.3222748},{\"Latitude\":47.0426827,\"Longitude\":8.3224114},{\"Latitude\":47.0426562,\"Longitude\":8.3224484},{\"Latitude\":47.0427012,\"Longitude\":8.3225175},{\"Latitude\":47.0427211,\"Longitude\":8.3225480},{\"Latitude\":47.0427451,\"Longitude\":8.3225144},{\"Latitude\":47.0427621,\"Longitude\":8.3225405},{\"Latitude\":47.0427998,\"Longitude\":8.3224876},{\"Latitude\":47.0428145,\"Longitude\":8.3225101},{\"Latitude\":47.0428878,\"Longitude\":8.3224072},{\"Latitude\":47.0429668,\"Longitude\":8.3222964},{\"Latitude\":47.0429816,\"Longitude\":8.3223191},{\"Latitude\":47.0430561,\"Longitude\":8.3222146},{\"Latitude\":47.0430413,\"Longitude\":8.3221918},{\"Latitude\":47.0431042,\"Longitude\":8.3221040},{\"Latitude\":47.0433787,\"Longitude\":8.3217183},{\"Latitude\":47.0433624,\"Longitude\":8.3216933},{\"Latitude\":47.0433897,\"Longitude\":8.3216550},{\"Latitude\":47.0434380,\"Longitude\":8.3217293}],[{\"Latitude\":47.0427621,\"Longitude\":8.3225405},{\"Latitude\":47.0427451,\"Longitude\":8.3225144},{\"Latitude\":47.0427211,\"Longitude\":8.3225480},{\"Latitude\":47.0427012,\"Longitude\":8.3225175},{\"Latitude\":47.0426384,\"Longitude\":8.3226058},{\"Latitude\":47.0426248,\"Longitude\":8.3225850},{\"Latitude\":47.0424846,\"Longitude\":8.3227821},{\"Latitude\":47.0425388,\"Longitude\":8.3228651},{\"Latitude\":47.0425523,\"Longitude\":8.3228462},{\"Latitude\":47.0425687,\"Longitude\":8.3228713},{\"Latitude\":47.0425524,\"Longitude\":8.3228942},{\"Latitude\":47.0426507,\"Longitude\":8.3230447},{\"Latitude\":47.0426899,\"Longitude\":8.3231048},{\"Latitude\":47.0427439,\"Longitude\":8.3230289},{\"Latitude\":47.0427287,\"Longitude\":8.3230056},{\"Latitude\":47.0427468,\"Longitude\":8.3229802},{\"Latitude\":47.0427631,\"Longitude\":8.3230052},{\"Latitude\":47.0429500,\"Longitude\":8.3227426},{\"Latitude\":47.0428962,\"Longitude\":8.3226601},{\"Latitude\":47.0428670,\"Longitude\":8.3227011},{\"Latitude\":47.0427621,\"Longitude\":8.3225405}],[{\"Latitude\":47.0434675,\"Longitude\":8.3216879},{\"Latitude\":47.0434380,\"Longitude\":8.3217293},{\"Latitude\":47.0434812,\"Longitude\":8.3217955},{\"Latitude\":47.0435032,\"Longitude\":8.3217646},{\"Latitude\":47.0435806,\"Longitude\":8.3218833},{\"Latitude\":47.0435465,\"Longitude\":8.3219311},{\"Latitude\":47.0435753,\"Longitude\":8.3219753},{\"Latitude\":47.0435954,\"Longitude\":8.3220062},{\"Latitude\":47.0437069,\"Longitude\":8.3218497},{\"Latitude\":47.0438841,\"Longitude\":8.3216010},{\"Latitude\":47.0438316,\"Longitude\":8.3215204},{\"Latitude\":47.0438191,\"Longitude\":8.3215380},{\"Latitude\":47.0438010,\"Longitude\":8.3215103},{\"Latitude\":47.0438141,\"Longitude\":8.3214919},{\"Latitude\":47.0437713,\"Longitude\":8.3214261},{\"Latitude\":47.0437605,\"Longitude\":8.3214412},{\"Latitude\":47.0437437,\"Longitude\":8.3214154},{\"Latitude\":47.0437557,\"Longitude\":8.3213985},{\"Latitude\":47.0436991,\"Longitude\":8.3213115},{\"Latitude\":47.0435217,\"Longitude\":8.3215604},{\"Latitude\":47.0435392,\"Longitude\":8.3215873},{\"Latitude\":47.0434675,\"Longitude\":8.3216879}]]";
        com.fasterxml.jackson.databind.ObjectMapper mapper = new com.fasterxml.jackson.databind.ObjectMapper();
        java.util.List<java.util.List<GeoPoint>> coords = mapper.readValue(a, new TypeReference<List<List<GeoPoint>>>() {});



        GeometryFactory geomFactory = new GeometryFactory();
        java.util.List<com.vividsolutions.jts.geom.Polygon> lsPolygons = new ArrayList<>();

        for (java.util.List<GeoPoint> thisCoords : coords)
        {
            com.vividsolutions.jts.geom.Polygon poly = geomFactory.createPolygon(ToNetTopologyCoordinates(thisCoords));
            lsPolygons.add(poly);
        }

        com.vividsolutions.jts.geom.Geometry ig = com.vividsolutions.jts.operation.union.CascadedPolygonUnion.union(lsPolygons);
        System.out.println(ig);
        // System.Console.WriteLine(ig.GetType().FullName);



        com.vividsolutions.jts.geom.MultiPolygon multi = (com.vividsolutions.jts.geom.MultiPolygon)ig;


        // ig = lalala.convexHull();
        org.opensphere.geometry.algorithm.ConcaveHull unionPolygon = new org.opensphere.geometry.algorithm.ConcaveHull(multi, 0.00049);
        Geometry geom = unionPolygon.getConcaveHull();


        com.vividsolutions.jts.geom.Coordinate[] hullCoordinates = geom.getCoordinates();

        // mapper.writeValue(new java.io.File("hullCoordinates.json"), hullCoordinates);


        java.util.List<GeoPoint> hullConversion = new ArrayList<>();

        for (com.vividsolutions.jts.geom.Coordinate thisCoordinate : hullCoordinates)
        {
            hullConversion.add(new GeoPoint(thisCoordinate.x, thisCoordinate.y));

            System.out.println(thisCoordinate.x);
            System.out.println(thisCoordinate.y);
        }

        mapper.writeValue(new java.io.File("hullCoordinates.json"), hullConversion);


/*
        // System.in.read();
        try
        {
            System.out.println(" --- Press any key to continue --- ");
            System.in.read();
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
*/

    }




}
