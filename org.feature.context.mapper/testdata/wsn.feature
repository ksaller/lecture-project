<?xml version="1.0" encoding="UTF-8"?>
<feature:FeatureModel xmi:version="2.0" xmlns:xmi="http://www.omg.org/XMI" xmlns:feature="http://www.tudresden.de/feature" name="WSN">
  <constraints language="SAT" expression="require(AdHoc,LAR)" constrainedFeatures="LAR AdHoc"/>
  <constraints language="SAT" expression="exclude(Infrastructure,LAR)" constrainedFeatures="Infrastructure LAR"/>
  <root minCardinality="1" maxCardinality="1" name="WSN_Platform">
    <groups minCardinality="1" maxCardinality="1">
      <childFeatures maxCardinality="1" name="Connection">
        <groups minCardinality="1" maxCardinality="1">
          <childFeatures maxCardinality="1" name="AdHoc" constraints="//@constraints.0">
            <groups minCardinality="1" maxCardinality="1">
              <childFeatures maxCardinality="1" name="WifiAdHoc"/>
            </groups>
          </childFeatures>
          <childFeatures maxCardinality="1" name="Infrastructure" constraints="//@constraints.1">
            <groups minCardinality="1" maxCardinality="1">
              <childFeatures maxCardinality="1" name="WifiInfrastructure"/>
              <childFeatures maxCardinality="1" name="GSM"/>
            </groups>
          </childFeatures>
        </groups>
      </childFeatures>
    </groups>
    <groups minCardinality="1" maxCardinality="1">
      <childFeatures maxCardinality="1" name="Routing">
        <groups minCardinality="1" maxCardinality="1">
          <childFeatures maxCardinality="1" name="BGP"/>
          <childFeatures maxCardinality="1" name="LAR" constraints="//@constraints.0 //@constraints.1"/>
        </groups>
      </childFeatures>
    </groups>
    <groups minCardinality="1" maxCardinality="1">
      <childFeatures minCardinality="1" maxCardinality="2" name="Monitoring">
        <groups maxCardinality="1">
          <childFeatures maxCardinality="1" name="Analysis"/>
        </groups>
        <groups minCardinality="1" maxCardinality="1">
          <childFeatures maxCardinality="1" name="CollectionProtocol">
            <groups minCardinality="1" maxCardinality="1">
              <childFeatures maxCardinality="1" name="PushSum"/>
              <childFeatures maxCardinality="1" name="SystemExp"/>
              <childFeatures maxCardinality="1" name="CS"/>
            </groups>
          </childFeatures>
        </groups>
      </childFeatures>
    </groups>
    <groups maxCardinality="1">
      <childFeatures maxCardinality="1" name="Sensors">
        <groups minCardinality="1" maxCardinality="3">
          <childFeatures maxCardinality="1" name="GPS"/>
          <childFeatures maxCardinality="1" name="Temperatur"/>
          <childFeatures maxCardinality="1" name="Pressure"/>
        </groups>
      </childFeatures>
    </groups>
    <groups minCardinality="1" maxCardinality="1">
      <childFeatures maxCardinality="1" name="Chipset">
        <groups minCardinality="1" maxCardinality="1">
          <childFeatures maxCardinality="1" name="ARM"/>
          <childFeatures maxCardinality="1" name="Intel"/>
        </groups>
      </childFeatures>
    </groups>
  </root>
</feature:FeatureModel>
