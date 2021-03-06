SYNTAXDEF clt
FOR <http://www.conper.de/classification> 
START ClassificationModel

OPTIONS {
	reloadGeneratorModel = "true";
    additionalDependencies = "org.featuremapper.models.feature, org.feature.multi.perspective.model";
	generateCodeFromGeneratorModel = "true";
	overrideLaunchConfigurationDelegate = "false";
	overridePluginXML = "false";
	overrideBuilder = "false";
	
 	srcFolder = "src/main/java";
	srcGenFolder = "src/gen/java";
	
	uiSrcFolder = "src/main/java";
	uiSrcGenFolder = "src/gen/java";
}

RULES {
	// syntax definition for class 'ClassificationModel'
	ClassificationModel   ::= "classification" !0    
							  "references" #1 (("featuremodel" #1 featureModel['<','>'])?|("mapping" #1 viewMapping['<','>'] ))? !0
							  (classifications*);
	
	// syntax definition for class 'Classification'
	Classification ::=  ("view group" #1 viewgroup['"','"'] #1 ":" !0)
						 classifiedFeatures* !0; 
	
	// syntax definition for class 'ClassifiedFeature'
	ClassifiedFeature ::= (#4 "feature" #1 feature['"','"'] #1 classified[Unclassified : "", Unbound: "unbound", Dead: "dead", Alive: "alive"]) !0;
}