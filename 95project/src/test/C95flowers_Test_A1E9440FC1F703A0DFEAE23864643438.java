/**@generated
 * WARNING  Changes you make to this file may be lost.
 *           File is generated and may be re-generated without warning.
 * @RPT-Core-generated Version 8.6
 */
/******************************************************************
* Licensed Materials - Property of IBM
* IBM Rational Web UI Test
* Copyright IBM Corporation 2013. All Rights Reserved.
* 
* U.S. Government Users Restricted Rights - Use, duplication or 
* disclosure restricted by GSA ADP Schedule Contract with IBM Corp.
******************************************************************/
/* TestScript.template - Suitable for collaborative code generation */
package test;

import com.ibm.rational.test.lt.datacorrelation.datapoolAction.Datapool;
import com.ibm.rational.test.lt.datacorrelation.datapoolAction.DatapoolAction;
import com.ibm.rational.test.lt.datacorrelation.execution.action.VariableAction;
import com.ibm.rational.test.lt.datacorrelation.execution.harvest.DataCorrelationVar;
import com.ibm.rational.test.lt.datacorrelation.execution.harvest.DataHarvester;
import com.ibm.rational.test.lt.datacorrelation.execution.harvest.DataVar;
import com.ibm.rational.test.lt.datacorrelation.execution.harvest.IDCArray;
import com.ibm.rational.test.lt.datacorrelation.execution.harvest.IDCCoreVar;
import com.ibm.rational.test.lt.datacorrelation.execution.harvest.IDataCorrelationVar;
import com.ibm.rational.test.lt.datacorrelation.execution.harvest.IDataHarvester;
import com.ibm.rational.test.lt.datacorrelation.execution.proto.ProtoAdapterHandler;
import com.ibm.rational.test.lt.datacorrelation.execution.sub.DataSub;
import com.ibm.rational.test.lt.datacorrelation.execution.sub.IDataSub;
import com.ibm.rational.test.lt.datacorrelation.execution.sub.ISubRule;
import com.ibm.rational.test.lt.datacorrelation.execution.sub.SubRule;
import com.ibm.rational.test.lt.execution.core.impl.LTTestScript;
import com.ibm.rational.test.lt.execution.http.IBasicAuthentication;
import com.ibm.rational.test.lt.execution.http.IConnectionRecord;
import com.ibm.rational.test.lt.execution.http.IHTTPRequest;
import com.ibm.rational.test.lt.execution.http.IHTTPSessionTypes;
import com.ibm.rational.test.lt.execution.http.INtlmAuthenticationContext;
import com.ibm.rational.test.lt.execution.http.ISSLInfo;
import com.ibm.rational.test.lt.execution.http.connection.IConnectionLimitsAlgorithm;
import com.ibm.rational.test.lt.execution.http.impl.ConfigConnection;
import com.ibm.rational.test.lt.execution.http.impl.DynamicHTTPRequestsContainer;
import com.ibm.rational.test.lt.execution.http.impl.DynamicRequestContainer;
import com.ibm.rational.test.lt.execution.http.impl.HTTPAction;
import com.ibm.rational.test.lt.execution.http.impl.HTTPPage;
import com.ibm.rational.test.lt.execution.http.impl.HTTPParallel;
import com.ibm.rational.test.lt.execution.http.impl.HTTPPostData;
import com.ibm.rational.test.lt.execution.http.impl.HTTPPostDataChunk;
import com.ibm.rational.test.lt.execution.http.impl.HTTPRequest;
import com.ibm.rational.test.lt.execution.http.impl.HTTPThink;
import com.ibm.rational.test.lt.execution.http.impl.INextActionGenerator;
import com.ibm.rational.test.lt.execution.http.impl.PerHostPortConnectionAlgorithm;
import com.ibm.rational.test.lt.execution.http.impl.RequestHeaderData;
import com.ibm.rational.test.lt.execution.http.impl.SSLInfo;
import com.ibm.rational.test.lt.execution.http.tes.*;
import com.ibm.rational.test.lt.execution.http.util.ConnectionRecordFactory;
import com.ibm.rational.test.lt.execution.http.util.CookieCacheUtil;
import com.ibm.rational.test.lt.execution.http.util.HTTPDataArea;
import com.ibm.rational.test.lt.execution.http.util.PageCacheUtil;
import com.ibm.rational.test.lt.execution.protocol.IProxyServerInfo;
import com.ibm.rational.test.lt.execution.protocol.impl.HTTPTestScriptHelper;
import com.ibm.rational.test.lt.kernel.IDataArea;
import com.ibm.rational.test.lt.kernel.action.IContainer;
import com.ibm.rational.test.lt.kernel.action.IKAction;
import com.ibm.rational.test.lt.kernel.action.IKTimeoutControl;
import com.ibm.rational.test.lt.kernel.action.impl.For;
import com.ibm.rational.test.lt.kernel.action.impl.KAction;
import com.ibm.rational.test.lt.kernel.action.impl.KThrow;
import com.ibm.rational.test.lt.kernel.dc.IKDCCoreVar;
import com.ibm.rational.test.lt.kernel.services.*;
import com.ibm.rational.test.lt.kernel.services.ITestExecutionServices;
import com.ibm.rational.test.lt.kernel.services.RPTEventStructure;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

@SuppressWarnings("all")
public class C95flowers_Test_A1E9440FC1F703A0DFEAE23864643438 extends LTTestScript  {

    static ProtoAdapterHandler pa = new ProtoAdapterHandler();
    static {           
        pa.addPA("com.ibm.rational.test.lt.datacorrelation.execution.protocol.core.CoreProtoAdapter", "coreAdapter");
pa.addPA("com.ibm.rational.test.lt.datacorrelation.execution.http.HTTPActionAdapter", "com.ibm.rational.test.lt.execution.http.impl.HTTPPostDataChunk");
pa.addPA("com.ibm.rational.test.lt.datacorrelation.execution.http.HTTPActionAdapter", "com.ibm.rational.test.lt.execution.http.impl.HTTPAction");
    }
	private IDataCorrelationVar[] dcVars = DataCorrelationVar.getArrayDCVars(52);
	private DataVar[] vars = new DataVar[2];
	
    
    
private HTTPTestScriptHelper httpTestScriptHelper;

	private HTTPTestScriptHelper getHTTPTest() {
		return httpTestScriptHelper;
	}

	
	public C95flowers_Test_A1E9440FC1F703A0DFEAE23864643438(IContainer container, String invocationId) {
		super(container, "95flowers", invocationId, "A1E9440FC1F703A0DFEAE23864643438");
		setArmEnabled(false);
		stopAtYourConvenience=false;
		this.httpTestScriptHelper = new HTTPTestScriptHelper(this);
        setTimeoutDuration(240000);
        setTimeoutScheme(IKTimeoutControl.CONTINUE);

	}

    public void execute() {
    	try {
				CookieCacheUtil.clearCookieCache((ITestExecutionServices)this);
	PageCacheUtil.clearPageCache((ITestExecutionServices)this);
	PageCacheUtil.setCacheEmulation((ITestExecutionServices)this, true);

	    		if (!isScheduleRun()) setThinkMax(2000);
	
	if (!isScheduleRun()){
this.addEventBehavior(new RPTEventStructure(new HTTPPageTitleVPEvent(), new RPTContinueEvent("Page title verification failed"), 1, "Page title verification failed"));
	this.addEventBehavior(new RPTEventStructure(new HTTPResponseCodeVPEvent(), new RPTContinueEvent("Response code verification failed"), 1, "Response code verification failed"));
	this.addEventBehavior(new RPTEventStructure(new HTTPResponseSizeVPEvent(), new RPTContinueEvent("Response size verification failed"), 1, "Response size verification failed"));
	this.addEventBehavior(new RPTEventStructure(new RPTFailVPEvent(), new RPTContinueEvent("Content Verification Point failed"), 1, "Content Verification Point failed"));
	this.addEventBehavior(new RPTEventStructure(new RPTConnectEvent(), new RPTContinueEvent("Connection failed"), 1, "Connection failed"));
	this.addEventBehavior(new RPTEventStructure(new RPTAuthenticationEvent(), new RPTContinueEvent("Authentication failed"), 1, "Authentication failed"));
	this.addEventBehavior(new RPTEventStructure(new RPTDataPoolEOFEvent(), new RPTStopUserEvent("End of dataset reached"), 1, "End of dataset reached"));
	this.addEventBehavior(new RPTEventStructure(new RPTReferenceEvent(), new RPTContinueEvent("Failed to extract reference"), 1, "Failed to extract reference"));
	this.addEventBehavior(new RPTEventStructure(new RPTSubstitutionEvent(), new RPTContinueEvent("Substitution failed"), 1, "Substitution failed"));
	this.addEventBehavior(new RPTEventStructure(new RPTServerTimeoutEvent(), new RPTContinueEvent("Timeout"), 1, "Timeout"));
	this.addEventBehavior(new RPTEventStructure(new RPTCustomCodeVPFailureEvent(), new RPTContinueEvent("Custom Verification Point failed"), 1, "Custom Verification Point failed"));
	this.addEventBehavior(new RPTEventStructure(new RPTCustomCodeAlertEvent(), new RPTContinueEvent("Custom Code reported an Alert"), 0, "Custom Code reported an Alert"));
	this.addEventBehavior(new RPTEventStructure(new RPTCustomCodeExceptionEvent(), new RPTStopUserEvent("Custom Code reported an unhandled exception"), 1, "Custom Code reported an unhandled exception"));
	}
	
	
	        	this.add(datapool_1(this));
	this.add(varAction_1(this));
	this.add(confCon_1(this));
	this.add(page_1(this));
		For loopNm_1 = Loop_1(this);
		this.add(loopNm_1);
		loopNm_1.addVarsToInit(Arrays.asList((IKDCCoreVar)vars[1],(IKDCCoreVar)vars[0]));
		
	this.add(page_5(this));
			this.httpTestScriptHelper.executeHelper();

	    } catch (Throwable e) {
		     log("Test Execution: C95flowers_Test_A1E9440FC1F703A0DFEAE23864643438 ",e);
	    } finally {
	        super.execute();
		}	    
    }
    
	public void preFinish() {
		this.httpTestScriptHelper.preFinishHelper();

		super.preFinish();
	}
	
	public void stop() {
		
		super.stop();
	}	
	
	
	private DatapoolAction datapool_1(IContainer parent) {
		DatapoolAction dpAction = new DatapoolAction(parent, "someflowers.csv", "A1E94411621C85C0DFEAE23864643438", false);
		Datapool dp = new Datapool(
				 "/Lzk1cHJvamVjdC9EYXRhc2V0cy9zb21lZmxvd2Vycy5jc3Y=.csv",
				 "/home/ibmadmin/IBM/rationalsdp/workspaces/95rpt-0311/95project/Datasets/someflowers.csv",
				 1,
				 false,
				 false,
				 Datapool.SEQUENTIAL,
				 null, 0, false, getVirtualUserName());
		dp.addHarvestInstruction("flowers", dcVars[0], false);
		dpAction.setDatapool(dp);
		return dpAction;
	}

private VariableAction varAction_1(final IContainer parent) {

	VariableAction vc = new VariableAction(parent, "", "A1E9440FC1F72ACDDFEAE23864643438");	
			vars[0] = new DataVar("95flowers_Host", "rptsvt-win21.nonprod.hclpnp.com", IDataArea.TEST, "IGNORE", false, false);

	
		vars[1] = new DataVar("95flowers_Host_Port", "9443", IDataArea.TEST, "IGNORE", false, false);

		
	vc.add(vars);
	return vc;
	
}

	private IKAction confCon_1(final IContainer parent) {
		IKAction action = new KAction(parent) {
			@Override
			public void execute() {
				ISSLInfo sslInfo = new SSLInfo("TLSv1.2", "ON", "SSL_RSA_WITH_AES_128_CBC_SHA256");
				IProxyServerInfo proxyServerInfo = null;
				
				
				ConfigConnection conn = new ConfigConnection(
					parent,
					"Config_1",
					(String)(vars[0].getValue()== null?"rptsvt-win21.nonprod.hclpnp.com": (String)vars[0].getValue()),  // host name
					Integer.parseInt((String)(vars[1].getValue()== null?"9443": (String)vars[1].getValue())), 
					sslInfo,  // SSL info
					null,  // NTLM info
					proxyServerInfo  // proxy server info
				);
				ConfigConnection.storeConfigConnection(this, conn);
				finish();
			}
		};
		return action;		
	}

private HTTPPage page_1(final IContainer parent) {
			HTTPThink think = new HTTPThink(0, 1, parent, parent, "A1E9440FC204BF4EDFEAE23864643438");
	parent.add(think);
	
		HTTPPage page = new HTTPPage(parent, "Plants By WebSphere Promo", "A1E9440FC204BF4EDFEAE23864643438") {
			
			public void execute() {   
				
	
	
	
	
			             
			{ // Parallal Block Start
				HTTPParallel httpParallel = new HTTPParallel(6, this);
				this.add(httpParallel);

				// httpParallel.addRequest(int serial, HTTPAction action, int actionDelay, String firstCharSemID) 
				httpParallel.addRequest(0, request_1(this, true, "A1E9440FC204BF40DFEAE23864643438", false, true,
						"Config_1", "rptsvt-win21.nonprod.hclpnp.com:9443/PlantsByWebSphere/promo.jsf",	"/PlantsByWebSphere/promo.jsf", true, false), 0, 100, "null", 3);
				httpParallel.addRequest(0, request_2(this, false, "A1E9440FC204BF40DFEAE23864643438", false, false,
						"Config_1", "rptsvt-win21.nonprod.hclpnp.com:9443/PlantsByWebSphere/javax.faces.resource/PlantMaster.css.jsf?ln=theme",	"/PlantsByWebSphere/javax.faces.resource/PlantMaster.css.jsf?ln=theme", true, false), 0, 100, "null", 3);
				httpParallel.addRequest(0, request_3(this, false, "A1E9440FC204BF40DFEAE23864643438", false, false,
						"Config_1", "rptsvt-win21.nonprod.hclpnp.com:9443/PlantsByWebSphere/javax.faces.resource/1x1_trans.gif.jsf?ln=images",	"/PlantsByWebSphere/javax.faces.resource/1x1_trans.gif.jsf?ln=images", true, false), 0, 100, "null", 3);
				httpParallel.addRequest(0, request_4(this, false, "A1E9440FC204BF40DFEAE23864643438", false, false,
						"Config_1", "rptsvt-win21.nonprod.hclpnp.com:9443/PlantsByWebSphere/javax.faces.resource/pbw.jpg.jsf?ln=images",	"/PlantsByWebSphere/javax.faces.resource/pbw.jpg.jsf?ln=images", true, false), 0, 100, "null", 3);
				httpParallel.addRequest(0, request_5(this, false, "A1E9440FC204BF40DFEAE23864643438", false, false,
						"Config_1", "rptsvt-win21.nonprod.hclpnp.com:9443/PlantsByWebSphere/javax.faces.resource/tab_trees_u.gif.jsf?ln=images",	"/PlantsByWebSphere/javax.faces.resource/tab_trees_u.gif.jsf?ln=images", true, false), 0, 100, "null", 3);
				httpParallel.addRequest(0, request_6(this, false, "A1E9440FC204BF40DFEAE23864643438", false, false,
						"Config_1", "rptsvt-win21.nonprod.hclpnp.com:9443/PlantsByWebSphere/javax.faces.resource/veggies_strawberries_48.jpg.jsf?ln=images",	"/PlantsByWebSphere/javax.faces.resource/veggies_strawberries_48.jpg.jsf?ln=images", true, false), 0, 100, "null", 3);
				httpParallel.addRequest(0, request_7(this, false, "A1E9440FC204BF40DFEAE23864643438", false, false,
						"Config_1", "rptsvt-win21.nonprod.hclpnp.com:9443/PlantsByWebSphere/resources/images/tabs_background.jpg",	"/PlantsByWebSphere/resources/images/tabs_background.jpg", true, false), 0, 100, "null", 3);
				httpParallel.addRequest(0, request_8(this, false, "A1E9440FC204BF40DFEAE23864643438", false, false,
						"Config_1", "rptsvt-win21.nonprod.hclpnp.com:9443/PlantsByWebSphere/javax.faces.resource/tab_flowers_u.gif.jsf?ln=images",	"/PlantsByWebSphere/javax.faces.resource/tab_flowers_u.gif.jsf?ln=images", true, false), 0, 100, "null", 3);
				httpParallel.addRequest(0, request_9(this, false, "A1E9440FC204BF40DFEAE23864643438", false, false,
						"Config_1", "rptsvt-win21.nonprod.hclpnp.com:9443/PlantsByWebSphere/javax.faces.resource/theme_summer1.gif.jsf?ln=images",	"/PlantsByWebSphere/javax.faces.resource/theme_summer1.gif.jsf?ln=images", true, false), 0, 100, "null", 3);
				httpParallel.addRequest(0, request_10(this, false, "A1E9440FC204BF40DFEAE23864643438", false, false,
						"Config_1", "rptsvt-win21.nonprod.hclpnp.com:9443/PlantsByWebSphere/javax.faces.resource/theme_summer2.gif.jsf?ln=images",	"/PlantsByWebSphere/javax.faces.resource/theme_summer2.gif.jsf?ln=images", true, false), 0, 100, "null", 3);
				httpParallel.addRequest(1, request_11(this, false, "A1E9440FC20B9D10DFEAE23864643438", false, false,
						"Config_1", "rptsvt-win21.nonprod.hclpnp.com:9443/PlantsByWebSphere/javax.faces.resource/tab_accessories_u.gif.jsf?ln=images",	"/PlantsByWebSphere/javax.faces.resource/tab_accessories_u.gif.jsf?ln=images", true, false), 106, 100, "A1E9440FC204BF5CDFEAE23864643438", 2);
				httpParallel.addRequest(0, request_12(this, false, "A1E9440FC204BF40DFEAE23864643438", false, false,
						"Config_1", "rptsvt-win21.nonprod.hclpnp.com:9443/PlantsByWebSphere/javax.faces.resource/trees_bonsai_48.jpg.jsf?ln=images",	"/PlantsByWebSphere/javax.faces.resource/trees_bonsai_48.jpg.jsf?ln=images", true, false), 0, 100, "null", 3);
				httpParallel.addRequest(0, request_13(this, false, "A1E9440FC204BF40DFEAE23864643438", false, false,
						"Config_1", "rptsvt-win21.nonprod.hclpnp.com:9443/PlantsByWebSphere/javax.faces.resource/poweredby_WebSphere.gif.jsf?ln=images",	"/PlantsByWebSphere/javax.faces.resource/poweredby_WebSphere.gif.jsf?ln=images", true, false), 0, 100, "null", 3);
				httpParallel.addRequest(2, request_14(this, false, "A1E9440FC20C879CDFEAE23864643438", false, false,
						"Config_1", "rptsvt-win21.nonprod.hclpnp.com:9443/PlantsByWebSphere/javax.faces.resource/flower_tulips_48.jpg.jsf?ln=images",	"/PlantsByWebSphere/javax.faces.resource/flower_tulips_48.jpg.jsf?ln=images", true, false), 142, 100, "A1E9440FC204BF5CDFEAE23864643438", 2);
				httpParallel.addRequest(3, request_15(this, false, "A1E9440FC20CFCA0DFEAE23864643438", false, false,
						"Config_1", "rptsvt-win21.nonprod.hclpnp.com:9443/PlantsByWebSphere/javax.faces.resource/oamSubmit.js.jsf?ln=org.apache.myfaces",	"/PlantsByWebSphere/javax.faces.resource/oamSubmit.js.jsf?ln=org.apache.myfaces", true, false), 166, 100, "A1E9440FC204BF5CDFEAE23864643438", 2);
				httpParallel.addRequest(4, request_16(this, false, "A1E9440FC20D4AC0DFEAE23864643438", false, false,
						"Config_1", "rptsvt-win21.nonprod.hclpnp.com:9443/PlantsByWebSphere/javax.faces.resource/theme_summer_text.gif.jsf?ln=images",	"/PlantsByWebSphere/javax.faces.resource/theme_summer_text.gif.jsf?ln=images", true, false), 179, 100, "A1E9440FC204BF5CDFEAE23864643438", 2);
				httpParallel.addRequest(5, request_17(this, false, "A1E9440FC20E0E10DFEAE23864643438", false, false,
						"Config_1", "rptsvt-win21.nonprod.hclpnp.com:9443/PlantsByWebSphere/javax.faces.resource/tab_veggies_u.gif.jsf?ln=images",	"/PlantsByWebSphere/javax.faces.resource/tab_veggies_u.gif.jsf?ln=images", true, false), 198, 100, "A1E9440FC204BF5CDFEAE23864643438", 2);
			} // Parallal Block End 

			
				super.execute();
			}
		};
		
		
		page.setRemoveDelaysFromPageResponseTimes(false);
		page.setArmEnabled(false);  
		return page;
	}

	public HTTPAction request_1(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1E9440FC204BF5CDFEAE23864643438", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(7);
					
		headers.add(new RequestHeaderData("Host", "rptsvt-win21.nonprod.hclpnp.com:9443", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (X11; Linux x86_64; rv:65.0) Gecko/20100101 Firefox/65.0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "text/html,application/xhtml+xml,application/xml;q=0.9,image/webp,*/*;q=0.8", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.5", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Upgrade-Insecure-Requests", "1", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataHarvester harvestContainer_1 = new DataHarvester();
	reqAction.addDataHarvester (harvestContainer_1);

	harvestContainer_1.addHarvestInstruction ("resp_hdr_Referer-RPT-Generated (read-only)_1", dcVars[1], ".*", 1, 0, 0, 0, false, "Referer-RPT-Generated (read-only)", null, 0, false);
	harvestContainer_1.addHarvestInstruction ("resp_content", dcVars[2], "\\?ln=(.*?)\"", 1, 1, 0, 0, false, "ln_124", null, 0, false);
	harvestContainer_1.addHarvestInstruction ("resp_content", dcVars[3], "\\?ln=(.*?)\"", 2, 1, 0, 0, false, "ln_122", null, 0, false);
	harvestContainer_1.addHarvestInstruction ("resp_content", dcVars[4], "\\?ln=(.*?)\"", 6, 4, 0, 0, false, "ln_123", null, 0, false);
	harvestContainer_1.addHarvestInstruction ("resp_content", dcVars[5], "<[[^>].]*?name=\"bannerform_SUBMIT\"(([[^>].]*?value=\"(.*?)\")|(?:[[^>].]*?>))", 1, 1, 0, 0, false, "value", null, 0, false);
	harvestContainer_1.addHarvestInstruction ("resp_content", dcVars[6], "<[[^>].]*?name=\"javax\\.faces\\.ViewState\"(([[^>].]*?value=\"(.*?)\")|(?:[[^>].]*?>))", 1, 1, 0, 0, false, "value_2", null, 0, false);
	IDataSub subContainer_1 = new DataSub();
	reqAction.addDataSub(subContainer_1);

		ISubRule sub_0 = new SubRule("req_hdr_Host_1", 32, 4, false, (IDCCoreVar)vars[1], false, "Host_392", null, 0, false);
	subContainer_1.addSubInstruction(sub_0);
		ISubRule sub_1 = new SubRule("req_hdr_Host_1", 0, 31, false, (IDCCoreVar)vars[0], false, "Host_391", null, 0, false);
	subContainer_1.addSubInstruction(sub_1);
	


		
				
		IConnectionRecord serverConnection = ConnectionRecordFactory.find(parent, 
				parallelGroup, connConfigName,
				true, // close connection at test boundary,
				null, 0, 1); // error behavior
		reqAction.io2=serverConnection.getHttp2ioConnector();
		IHTTPRequest req = new HTTPRequest(
			"GET",	// method
			"https",  // protocol - http or https
			url, isURLRelative,
			"1.1",	// version
			headers,
			IHTTPSessionTypes.STANDARD,
			0, // delay
			isPrimary,
			null,// post data
			basicAuth,
			serverConnection,
			reqAction,
			"UTF-8",
			"ISO-8859-1",
			"A1E9440FC204BF5FDFEAE23864643438",
			true,
			false
		);
		
		req.setExpectedResponseCode(200);
		req.setConnectionClose(connectionClose);
		

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("text/html; charset=ISO-8859-1");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(true);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}

	public HTTPAction request_2(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1E9440FC2061ED0DFEAE23864643438", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(8);
					
		headers.add(new RequestHeaderData("Host", "rptsvt-win21.nonprod.hclpnp.com:9443", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (X11; Linux x86_64; rv:65.0) Gecko/20100101 Firefox/65.0", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("Accept", "text/css,*/*;q=0.1", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.5", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("Referer", "https://rptsvt-win21.nonprod.hclpnp.com:9443/PlantsByWebSphere/promo.jsf", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("If-Modified-Since", "Fri, 22 Feb 2019 14:47:04 GMT", "ISO-8859-1", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_2 = new DataSub();
	reqAction.addDataSub(subContainer_2);

		ISubRule sub_2 = new SubRule("req_uri", 63, 5, true, (IDCCoreVar)dcVars[2], false, "ln", null, 0, false);
	subContainer_2.addSubInstruction(sub_2);
		ISubRule sub_3 = new SubRule("req_hdr_Host_1", 32, 4, false, (IDCCoreVar)vars[1], false, "Host_390", null, 0, false);
	subContainer_2.addSubInstruction(sub_3);
		ISubRule sub_4 = new SubRule("req_hdr_Referer_1", 0, 72, false, (IDCCoreVar)dcVars[1], false, "Referer_195", null, 0, false);
	subContainer_2.addSubInstruction(sub_4);
		ISubRule sub_5 = new SubRule("req_hdr_Host_1", 0, 31, false, (IDCCoreVar)vars[0], false, "Host_389", null, 0, false);
	subContainer_2.addSubInstruction(sub_5);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E9440FC204BF5CDFEAE23864643438"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E9440FC204BF5CDFEAE23864643438"), 3);		
		IConnectionRecord serverConnection = ConnectionRecordFactory.find(parent, 
				parallelGroup, connConfigName,
				true, // close connection at test boundary,
				null, 0, 1); // error behavior
		reqAction.io2=serverConnection.getHttp2ioConnector();
		IHTTPRequest req = new HTTPRequest(
			"GET",	// method
			"https",  // protocol - http or https
			url, isURLRelative,
			"1.1",	// version
			headers,
			IHTTPSessionTypes.STANDARD,
			0, // delay
			isPrimary,
			null,// post data
			basicAuth,
			serverConnection,
			reqAction,
			"ISO-8859-1",
			"ISO-8859-1",
			"A1E9440FC2061ED3DFEAE23864643438",
			true,
			false
		);
		
		req.setExpectedResponseCode(200);
		req.setConnectionClose(connectionClose);
		

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("text/css");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}

	public HTTPAction request_3(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1E9440FC2069400DFEAE23864643438", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(8);
					
		headers.add(new RequestHeaderData("Host", "rptsvt-win21.nonprod.hclpnp.com:9443", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (X11; Linux x86_64; rv:65.0) Gecko/20100101 Firefox/65.0", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("Accept", "image/webp,*/*", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.5", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("Referer", "https://rptsvt-win21.nonprod.hclpnp.com:9443/PlantsByWebSphere/promo.jsf", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("If-Modified-Since", "Mon, 16 Jan 2012 21:43:22 GMT", "ISO-8859-1", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_3 = new DataSub();
	reqAction.addDataSub(subContainer_3);

		ISubRule sub_6 = new SubRule("req_uri", 61, 6, true, (IDCCoreVar)dcVars[3], false, "ln", null, 0, false);
	subContainer_3.addSubInstruction(sub_6);
		ISubRule sub_7 = new SubRule("req_hdr_Host_1", 32, 4, false, (IDCCoreVar)vars[1], false, "Host_388", null, 0, false);
	subContainer_3.addSubInstruction(sub_7);
		ISubRule sub_8 = new SubRule("req_hdr_Referer_1", 0, 72, false, (IDCCoreVar)dcVars[1], false, "Referer_194", null, 0, false);
	subContainer_3.addSubInstruction(sub_8);
		ISubRule sub_9 = new SubRule("req_hdr_Host_1", 0, 31, false, (IDCCoreVar)vars[0], false, "Host_387", null, 0, false);
	subContainer_3.addSubInstruction(sub_9);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E9440FC204BF5CDFEAE23864643438"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E9440FC204BF5CDFEAE23864643438"), 3);		
		IConnectionRecord serverConnection = ConnectionRecordFactory.find(parent, 
				parallelGroup, connConfigName,
				true, // close connection at test boundary,
				null, 0, 1); // error behavior
		reqAction.io2=serverConnection.getHttp2ioConnector();
		IHTTPRequest req = new HTTPRequest(
			"GET",	// method
			"https",  // protocol - http or https
			url, isURLRelative,
			"1.1",	// version
			headers,
			IHTTPSessionTypes.STANDARD,
			0, // delay
			isPrimary,
			null,// post data
			basicAuth,
			serverConnection,
			reqAction,
			"ISO-8859-1",
			"ISO-8859-1",
			"A1E9440FC2069403DFEAE23864643438",
			true,
			false
		);
		
		req.setExpectedResponseCode(304);
		req.setConnectionClose(connectionClose);
		

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("https//");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}

	public HTTPAction request_4(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1E9440FC2073040DFEAE23864643438", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(8);
					
		headers.add(new RequestHeaderData("Host", "rptsvt-win21.nonprod.hclpnp.com:9443", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (X11; Linux x86_64; rv:65.0) Gecko/20100101 Firefox/65.0", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("Accept", "image/webp,*/*", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.5", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("Referer", "https://rptsvt-win21.nonprod.hclpnp.com:9443/PlantsByWebSphere/promo.jsf", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("If-Modified-Since", "Mon, 16 Jan 2012 21:43:22 GMT", "ISO-8859-1", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_4 = new DataSub();
	reqAction.addDataSub(subContainer_4);

		ISubRule sub_10 = new SubRule("req_uri", 55, 6, true, (IDCCoreVar)dcVars[3], false, "ln", null, 0, false);
	subContainer_4.addSubInstruction(sub_10);
		ISubRule sub_11 = new SubRule("req_hdr_Host_1", 32, 4, false, (IDCCoreVar)vars[1], false, "Host_386", null, 0, false);
	subContainer_4.addSubInstruction(sub_11);
		ISubRule sub_12 = new SubRule("req_hdr_Referer_1", 0, 72, false, (IDCCoreVar)dcVars[1], false, "Referer_193", null, 0, false);
	subContainer_4.addSubInstruction(sub_12);
		ISubRule sub_13 = new SubRule("req_hdr_Host_1", 0, 31, false, (IDCCoreVar)vars[0], false, "Host_385", null, 0, false);
	subContainer_4.addSubInstruction(sub_13);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E9440FC204BF5CDFEAE23864643438"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E9440FC204BF5CDFEAE23864643438"), 3);		
		IConnectionRecord serverConnection = ConnectionRecordFactory.find(parent, 
				parallelGroup, connConfigName,
				true, // close connection at test boundary,
				null, 0, 1); // error behavior
		reqAction.io2=serverConnection.getHttp2ioConnector();
		IHTTPRequest req = new HTTPRequest(
			"GET",	// method
			"https",  // protocol - http or https
			url, isURLRelative,
			"1.1",	// version
			headers,
			IHTTPSessionTypes.STANDARD,
			0, // delay
			isPrimary,
			null,// post data
			basicAuth,
			serverConnection,
			reqAction,
			"ISO-8859-1",
			"ISO-8859-1",
			"A1E9440FC2073043DFEAE23864643438",
			true,
			false
		);
		
		req.setExpectedResponseCode(304);
		req.setConnectionClose(connectionClose);
		

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("https//");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}

	public HTTPAction request_5(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1E9440FC2075767DFEAE23864643438", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(8);
					
		headers.add(new RequestHeaderData("Host", "rptsvt-win21.nonprod.hclpnp.com:9443", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (X11; Linux x86_64; rv:65.0) Gecko/20100101 Firefox/65.0", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("Accept", "image/webp,*/*", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.5", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("Referer", "https://rptsvt-win21.nonprod.hclpnp.com:9443/PlantsByWebSphere/promo.jsf", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("If-Modified-Since", "Mon, 16 Jan 2012 21:43:22 GMT", "ISO-8859-1", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_5 = new DataSub();
	reqAction.addDataSub(subContainer_5);

		ISubRule sub_14 = new SubRule("req_uri", 63, 6, true, (IDCCoreVar)dcVars[3], false, "ln", null, 0, false);
	subContainer_5.addSubInstruction(sub_14);
		ISubRule sub_15 = new SubRule("req_hdr_Host_1", 32, 4, false, (IDCCoreVar)vars[1], false, "Host_384", null, 0, false);
	subContainer_5.addSubInstruction(sub_15);
		ISubRule sub_16 = new SubRule("req_hdr_Referer_1", 0, 72, false, (IDCCoreVar)dcVars[1], false, "Referer_192", null, 0, false);
	subContainer_5.addSubInstruction(sub_16);
		ISubRule sub_17 = new SubRule("req_hdr_Host_1", 0, 31, false, (IDCCoreVar)vars[0], false, "Host_383", null, 0, false);
	subContainer_5.addSubInstruction(sub_17);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E9440FC204BF5CDFEAE23864643438"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E9440FC204BF5CDFEAE23864643438"), 3);		
		IConnectionRecord serverConnection = ConnectionRecordFactory.find(parent, 
				parallelGroup, connConfigName,
				true, // close connection at test boundary,
				null, 0, 1); // error behavior
		reqAction.io2=serverConnection.getHttp2ioConnector();
		IHTTPRequest req = new HTTPRequest(
			"GET",	// method
			"https",  // protocol - http or https
			url, isURLRelative,
			"1.1",	// version
			headers,
			IHTTPSessionTypes.STANDARD,
			0, // delay
			isPrimary,
			null,// post data
			basicAuth,
			serverConnection,
			reqAction,
			"ISO-8859-1",
			"ISO-8859-1",
			"A1E9440FC207576ADFEAE23864643438",
			true,
			false
		);
		
		req.setExpectedResponseCode(304);
		req.setConnectionClose(connectionClose);
		

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("https//");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}

	public HTTPAction request_6(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1E9440FC207F390DFEAE23864643438", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(8);
					
		headers.add(new RequestHeaderData("Host", "rptsvt-win21.nonprod.hclpnp.com:9443", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (X11; Linux x86_64; rv:65.0) Gecko/20100101 Firefox/65.0", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("Accept", "image/webp,*/*", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.5", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("Referer", "https://rptsvt-win21.nonprod.hclpnp.com:9443/PlantsByWebSphere/promo.jsf", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("If-Modified-Since", "Mon, 16 Jan 2012 21:43:22 GMT", "ISO-8859-1", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_6 = new DataSub();
	reqAction.addDataSub(subContainer_6);

		ISubRule sub_18 = new SubRule("req_uri", 75, 6, true, (IDCCoreVar)dcVars[3], false, "ln", null, 0, false);
	subContainer_6.addSubInstruction(sub_18);
		ISubRule sub_19 = new SubRule("req_hdr_Host_1", 32, 4, false, (IDCCoreVar)vars[1], false, "Host_382", null, 0, false);
	subContainer_6.addSubInstruction(sub_19);
		ISubRule sub_20 = new SubRule("req_hdr_Referer_1", 0, 72, false, (IDCCoreVar)dcVars[1], false, "Referer_191", null, 0, false);
	subContainer_6.addSubInstruction(sub_20);
		ISubRule sub_21 = new SubRule("req_hdr_Host_1", 0, 31, false, (IDCCoreVar)vars[0], false, "Host_381", null, 0, false);
	subContainer_6.addSubInstruction(sub_21);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E9440FC204BF5CDFEAE23864643438"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E9440FC204BF5CDFEAE23864643438"), 3);		
		IConnectionRecord serverConnection = ConnectionRecordFactory.find(parent, 
				parallelGroup, connConfigName,
				true, // close connection at test boundary,
				null, 0, 1); // error behavior
		reqAction.io2=serverConnection.getHttp2ioConnector();
		IHTTPRequest req = new HTTPRequest(
			"GET",	// method
			"https",  // protocol - http or https
			url, isURLRelative,
			"1.1",	// version
			headers,
			IHTTPSessionTypes.STANDARD,
			0, // delay
			isPrimary,
			null,// post data
			basicAuth,
			serverConnection,
			reqAction,
			"ISO-8859-1",
			"ISO-8859-1",
			"A1E9440FC207F393DFEAE23864643438",
			true,
			false
		);
		
		req.setExpectedResponseCode(304);
		req.setConnectionClose(connectionClose);
		

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("https//");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}

	public HTTPAction request_7(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1E9440FC20868C0DFEAE23864643438", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(8);
					
		headers.add(new RequestHeaderData("Host", "rptsvt-win21.nonprod.hclpnp.com:9443", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (X11; Linux x86_64; rv:65.0) Gecko/20100101 Firefox/65.0", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("Accept", "image/webp,*/*", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.5", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("Referer", "https://rptsvt-win21.nonprod.hclpnp.com:9443/PlantsByWebSphere/promo.jsf", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("If-Modified-Since", "Mon, 16 Jan 2012 21:43:22 GMT", "ISO-8859-1", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_7 = new DataSub();
	reqAction.addDataSub(subContainer_7);

		ISubRule sub_22 = new SubRule("req_hdr_Host_1", 32, 4, false, (IDCCoreVar)vars[1], false, "Host_380", null, 0, false);
	subContainer_7.addSubInstruction(sub_22);
		ISubRule sub_23 = new SubRule("req_hdr_Referer_1", 0, 72, false, (IDCCoreVar)dcVars[1], false, "Referer_190", null, 0, false);
	subContainer_7.addSubInstruction(sub_23);
		ISubRule sub_24 = new SubRule("req_hdr_Host_1", 0, 31, false, (IDCCoreVar)vars[0], false, "Host_379", null, 0, false);
	subContainer_7.addSubInstruction(sub_24);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E9440FC204BF5CDFEAE23864643438"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E9440FC204BF5CDFEAE23864643438"), 3);		
		IConnectionRecord serverConnection = ConnectionRecordFactory.find(parent, 
				parallelGroup, connConfigName,
				true, // close connection at test boundary,
				null, 0, 1); // error behavior
		reqAction.io2=serverConnection.getHttp2ioConnector();
		IHTTPRequest req = new HTTPRequest(
			"GET",	// method
			"https",  // protocol - http or https
			url, isURLRelative,
			"1.1",	// version
			headers,
			IHTTPSessionTypes.STANDARD,
			0, // delay
			isPrimary,
			null,// post data
			basicAuth,
			serverConnection,
			reqAction,
			"ISO-8859-1",
			"ISO-8859-1",
			"A1E9440FC20868C3DFEAE23864643438",
			true,
			false
		);
		
		req.setExpectedResponseCode(304);
		req.setConnectionClose(connectionClose);
		

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("image/jpeg");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}

	public HTTPAction request_8(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1E9440FC208DDF0DFEAE23864643438", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(8);
					
		headers.add(new RequestHeaderData("Host", "rptsvt-win21.nonprod.hclpnp.com:9443", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (X11; Linux x86_64; rv:65.0) Gecko/20100101 Firefox/65.0", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("Accept", "image/webp,*/*", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.5", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("Referer", "https://rptsvt-win21.nonprod.hclpnp.com:9443/PlantsByWebSphere/promo.jsf", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("If-Modified-Since", "Mon, 16 Jan 2012 21:43:20 GMT", "ISO-8859-1", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_8 = new DataSub();
	reqAction.addDataSub(subContainer_8);

		ISubRule sub_25 = new SubRule("req_uri", 65, 6, true, (IDCCoreVar)dcVars[3], false, "ln", null, 0, false);
	subContainer_8.addSubInstruction(sub_25);
		ISubRule sub_26 = new SubRule("req_hdr_Host_1", 32, 4, false, (IDCCoreVar)vars[1], false, "Host_378", null, 0, false);
	subContainer_8.addSubInstruction(sub_26);
		ISubRule sub_27 = new SubRule("req_hdr_Referer_1", 0, 72, false, (IDCCoreVar)dcVars[1], false, "Referer_189", null, 0, false);
	subContainer_8.addSubInstruction(sub_27);
		ISubRule sub_28 = new SubRule("req_hdr_Host_1", 0, 31, false, (IDCCoreVar)vars[0], false, "Host_377", null, 0, false);
	subContainer_8.addSubInstruction(sub_28);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E9440FC204BF5CDFEAE23864643438"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E9440FC204BF5CDFEAE23864643438"), 3);		
		IConnectionRecord serverConnection = ConnectionRecordFactory.find(parent, 
				parallelGroup, connConfigName,
				true, // close connection at test boundary,
				null, 0, 1); // error behavior
		reqAction.io2=serverConnection.getHttp2ioConnector();
		IHTTPRequest req = new HTTPRequest(
			"GET",	// method
			"https",  // protocol - http or https
			url, isURLRelative,
			"1.1",	// version
			headers,
			IHTTPSessionTypes.STANDARD,
			0, // delay
			isPrimary,
			null,// post data
			basicAuth,
			serverConnection,
			reqAction,
			"ISO-8859-1",
			"ISO-8859-1",
			"A1E9440FC208DDF3DFEAE23864643438",
			true,
			false
		);
		
		req.setExpectedResponseCode(304);
		req.setConnectionClose(connectionClose);
		

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("https//");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}

	public HTTPAction request_9(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1E9440FC209053DDFEAE23864643438", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(8);
					
		headers.add(new RequestHeaderData("Host", "rptsvt-win21.nonprod.hclpnp.com:9443", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (X11; Linux x86_64; rv:65.0) Gecko/20100101 Firefox/65.0", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("Accept", "image/webp,*/*", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.5", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("Referer", "https://rptsvt-win21.nonprod.hclpnp.com:9443/PlantsByWebSphere/promo.jsf", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("If-Modified-Since", "Mon, 16 Jan 2012 21:43:22 GMT", "ISO-8859-1", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_9 = new DataSub();
	reqAction.addDataSub(subContainer_9);

		ISubRule sub_29 = new SubRule("req_uri", 65, 6, true, (IDCCoreVar)dcVars[3], false, "ln", null, 0, false);
	subContainer_9.addSubInstruction(sub_29);
		ISubRule sub_30 = new SubRule("req_hdr_Host_1", 32, 4, false, (IDCCoreVar)vars[1], false, "Host_376", null, 0, false);
	subContainer_9.addSubInstruction(sub_30);
		ISubRule sub_31 = new SubRule("req_hdr_Referer_1", 0, 72, false, (IDCCoreVar)dcVars[1], false, "Referer_188", null, 0, false);
	subContainer_9.addSubInstruction(sub_31);
		ISubRule sub_32 = new SubRule("req_hdr_Host_1", 0, 31, false, (IDCCoreVar)vars[0], false, "Host_375", null, 0, false);
	subContainer_9.addSubInstruction(sub_32);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E9440FC204BF5CDFEAE23864643438"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E9440FC204BF5CDFEAE23864643438"), 3);		
		IConnectionRecord serverConnection = ConnectionRecordFactory.find(parent, 
				parallelGroup, connConfigName,
				true, // close connection at test boundary,
				null, 0, 1); // error behavior
		reqAction.io2=serverConnection.getHttp2ioConnector();
		IHTTPRequest req = new HTTPRequest(
			"GET",	// method
			"https",  // protocol - http or https
			url, isURLRelative,
			"1.1",	// version
			headers,
			IHTTPSessionTypes.STANDARD,
			0, // delay
			isPrimary,
			null,// post data
			basicAuth,
			serverConnection,
			reqAction,
			"ISO-8859-1",
			"ISO-8859-1",
			"A1E9440FC2090540DFEAE23864643438",
			true,
			false
		);
		
		req.setExpectedResponseCode(304);
		req.setConnectionClose(connectionClose);
		

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("https//");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}

	public HTTPAction request_10(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1E9440FC209C850DFEAE23864643438", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(8);
					
		headers.add(new RequestHeaderData("Host", "rptsvt-win21.nonprod.hclpnp.com:9443", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (X11; Linux x86_64; rv:65.0) Gecko/20100101 Firefox/65.0", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("Accept", "image/webp,*/*", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.5", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("Referer", "https://rptsvt-win21.nonprod.hclpnp.com:9443/PlantsByWebSphere/promo.jsf", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("If-Modified-Since", "Mon, 16 Jan 2012 21:43:22 GMT", "ISO-8859-1", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_10 = new DataSub();
	reqAction.addDataSub(subContainer_10);

		ISubRule sub_33 = new SubRule("req_uri", 65, 6, true, (IDCCoreVar)dcVars[3], false, "ln", null, 0, false);
	subContainer_10.addSubInstruction(sub_33);
		ISubRule sub_34 = new SubRule("req_hdr_Host_1", 32, 4, false, (IDCCoreVar)vars[1], false, "Host_374", null, 0, false);
	subContainer_10.addSubInstruction(sub_34);
		ISubRule sub_35 = new SubRule("req_hdr_Referer_1", 0, 72, false, (IDCCoreVar)dcVars[1], false, "Referer_187", null, 0, false);
	subContainer_10.addSubInstruction(sub_35);
		ISubRule sub_36 = new SubRule("req_hdr_Host_1", 0, 31, false, (IDCCoreVar)vars[0], false, "Host_373", null, 0, false);
	subContainer_10.addSubInstruction(sub_36);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E9440FC204BF5CDFEAE23864643438"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E9440FC204BF5CDFEAE23864643438"), 3);		
		IConnectionRecord serverConnection = ConnectionRecordFactory.find(parent, 
				parallelGroup, connConfigName,
				true, // close connection at test boundary,
				null, 0, 1); // error behavior
		reqAction.io2=serverConnection.getHttp2ioConnector();
		IHTTPRequest req = new HTTPRequest(
			"GET",	// method
			"https",  // protocol - http or https
			url, isURLRelative,
			"1.1",	// version
			headers,
			IHTTPSessionTypes.STANDARD,
			0, // delay
			isPrimary,
			null,// post data
			basicAuth,
			serverConnection,
			reqAction,
			"ISO-8859-1",
			"ISO-8859-1",
			"A1E9440FC209C853DFEAE23864643438",
			true,
			false
		);
		
		req.setExpectedResponseCode(304);
		req.setConnectionClose(connectionClose);
		

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("https//");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}

	public HTTPAction request_11(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1E9440FC20BC42CDFEAE23864643438", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(8);
					
		headers.add(new RequestHeaderData("Host", "rptsvt-win21.nonprod.hclpnp.com:9443", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (X11; Linux x86_64; rv:65.0) Gecko/20100101 Firefox/65.0", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("Accept", "image/webp,*/*", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.5", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("Referer", "https://rptsvt-win21.nonprod.hclpnp.com:9443/PlantsByWebSphere/promo.jsf", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("If-Modified-Since", "Mon, 16 Jan 2012 21:43:20 GMT", "ISO-8859-1", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_11 = new DataSub();
	reqAction.addDataSub(subContainer_11);

		ISubRule sub_37 = new SubRule("req_uri", 69, 6, true, (IDCCoreVar)dcVars[3], false, "ln", null, 0, false);
	subContainer_11.addSubInstruction(sub_37);
		ISubRule sub_38 = new SubRule("req_hdr_Host_1", 32, 4, false, (IDCCoreVar)vars[1], false, "Host_372", null, 0, false);
	subContainer_11.addSubInstruction(sub_38);
		ISubRule sub_39 = new SubRule("req_hdr_Referer_1", 0, 72, false, (IDCCoreVar)dcVars[1], false, "Referer_186", null, 0, false);
	subContainer_11.addSubInstruction(sub_39);
		ISubRule sub_40 = new SubRule("req_hdr_Host_1", 0, 31, false, (IDCCoreVar)vars[0], false, "Host_371", null, 0, false);
	subContainer_11.addSubInstruction(sub_40);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E9440FC204BF5CDFEAE23864643438"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E9440FC204BF5CDFEAE23864643438"), 3);		
		IConnectionRecord serverConnection = ConnectionRecordFactory.find(parent, 
				parallelGroup, connConfigName,
				true, // close connection at test boundary,
				null, 0, 1); // error behavior
		reqAction.io2=serverConnection.getHttp2ioConnector();
		IHTTPRequest req = new HTTPRequest(
			"GET",	// method
			"https",  // protocol - http or https
			url, isURLRelative,
			"1.1",	// version
			headers,
			IHTTPSessionTypes.STANDARD,
			0, // delay
			isPrimary,
			null,// post data
			basicAuth,
			serverConnection,
			reqAction,
			"ISO-8859-1",
			"ISO-8859-1",
			"A1E9440FC20BC42FDFEAE23864643438",
			true,
			false
		);
		
		req.setExpectedResponseCode(304);
		req.setConnectionClose(connectionClose);
		

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("https//");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}

	public HTTPAction request_12(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1E9440FC20BEB37DFEAE23864643438", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(8);
					
		headers.add(new RequestHeaderData("Host", "rptsvt-win21.nonprod.hclpnp.com:9443", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (X11; Linux x86_64; rv:65.0) Gecko/20100101 Firefox/65.0", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("Accept", "image/webp,*/*", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.5", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("Referer", "https://rptsvt-win21.nonprod.hclpnp.com:9443/PlantsByWebSphere/promo.jsf", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("If-Modified-Since", "Mon, 16 Jan 2012 21:43:22 GMT", "ISO-8859-1", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_12 = new DataSub();
	reqAction.addDataSub(subContainer_12);

		ISubRule sub_41 = new SubRule("req_uri", 67, 6, true, (IDCCoreVar)dcVars[3], false, "ln", null, 0, false);
	subContainer_12.addSubInstruction(sub_41);
		ISubRule sub_42 = new SubRule("req_hdr_Host_1", 32, 4, false, (IDCCoreVar)vars[1], false, "Host_370", null, 0, false);
	subContainer_12.addSubInstruction(sub_42);
		ISubRule sub_43 = new SubRule("req_hdr_Referer_1", 0, 72, false, (IDCCoreVar)dcVars[1], false, "Referer_185", null, 0, false);
	subContainer_12.addSubInstruction(sub_43);
		ISubRule sub_44 = new SubRule("req_hdr_Host_1", 0, 31, false, (IDCCoreVar)vars[0], false, "Host_369", null, 0, false);
	subContainer_12.addSubInstruction(sub_44);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E9440FC204BF5CDFEAE23864643438"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E9440FC204BF5CDFEAE23864643438"), 3);		
		IConnectionRecord serverConnection = ConnectionRecordFactory.find(parent, 
				parallelGroup, connConfigName,
				true, // close connection at test boundary,
				null, 0, 1); // error behavior
		reqAction.io2=serverConnection.getHttp2ioConnector();
		IHTTPRequest req = new HTTPRequest(
			"GET",	// method
			"https",  // protocol - http or https
			url, isURLRelative,
			"1.1",	// version
			headers,
			IHTTPSessionTypes.STANDARD,
			0, // delay
			isPrimary,
			null,// post data
			basicAuth,
			serverConnection,
			reqAction,
			"ISO-8859-1",
			"ISO-8859-1",
			"A1E9440FC20BEB3ADFEAE23864643438",
			true,
			false
		);
		
		req.setExpectedResponseCode(304);
		req.setConnectionClose(connectionClose);
		

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("https//");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}

	public HTTPAction request_13(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1E9440FC20C6060DFEAE23864643438", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(8);
					
		headers.add(new RequestHeaderData("Host", "rptsvt-win21.nonprod.hclpnp.com:9443", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (X11; Linux x86_64; rv:65.0) Gecko/20100101 Firefox/65.0", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("Accept", "image/webp,*/*", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.5", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("Referer", "https://rptsvt-win21.nonprod.hclpnp.com:9443/PlantsByWebSphere/promo.jsf", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("If-Modified-Since", "Mon, 16 Jan 2012 21:43:22 GMT", "ISO-8859-1", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_13 = new DataSub();
	reqAction.addDataSub(subContainer_13);

		ISubRule sub_45 = new SubRule("req_uri", 71, 6, true, (IDCCoreVar)dcVars[3], false, "ln", null, 0, false);
	subContainer_13.addSubInstruction(sub_45);
		ISubRule sub_46 = new SubRule("req_hdr_Host_1", 32, 4, false, (IDCCoreVar)vars[1], false, "Host_368", null, 0, false);
	subContainer_13.addSubInstruction(sub_46);
		ISubRule sub_47 = new SubRule("req_hdr_Referer_1", 0, 72, false, (IDCCoreVar)dcVars[1], false, "Referer_184", null, 0, false);
	subContainer_13.addSubInstruction(sub_47);
		ISubRule sub_48 = new SubRule("req_hdr_Host_1", 0, 31, false, (IDCCoreVar)vars[0], false, "Host_367", null, 0, false);
	subContainer_13.addSubInstruction(sub_48);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E9440FC204BF5CDFEAE23864643438"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E9440FC204BF5CDFEAE23864643438"), 3);		
		IConnectionRecord serverConnection = ConnectionRecordFactory.find(parent, 
				parallelGroup, connConfigName,
				true, // close connection at test boundary,
				null, 0, 1); // error behavior
		reqAction.io2=serverConnection.getHttp2ioConnector();
		IHTTPRequest req = new HTTPRequest(
			"GET",	// method
			"https",  // protocol - http or https
			url, isURLRelative,
			"1.1",	// version
			headers,
			IHTTPSessionTypes.STANDARD,
			0, // delay
			isPrimary,
			null,// post data
			basicAuth,
			serverConnection,
			reqAction,
			"ISO-8859-1",
			"ISO-8859-1",
			"A1E9440FC20C6063DFEAE23864643438",
			true,
			false
		);
		
		req.setExpectedResponseCode(304);
		req.setConnectionClose(connectionClose);
		

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("https//");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}

	public HTTPAction request_14(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1E9440FC20C87AADFEAE23864643438", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(8);
					
		headers.add(new RequestHeaderData("Host", "rptsvt-win21.nonprod.hclpnp.com:9443", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (X11; Linux x86_64; rv:65.0) Gecko/20100101 Firefox/65.0", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("Accept", "image/webp,*/*", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.5", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("Referer", "https://rptsvt-win21.nonprod.hclpnp.com:9443/PlantsByWebSphere/promo.jsf", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("If-Modified-Since", "Mon, 16 Jan 2012 21:43:22 GMT", "ISO-8859-1", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_14 = new DataSub();
	reqAction.addDataSub(subContainer_14);

		ISubRule sub_49 = new SubRule("req_uri", 68, 6, true, (IDCCoreVar)dcVars[3], false, "ln", null, 0, false);
	subContainer_14.addSubInstruction(sub_49);
		ISubRule sub_50 = new SubRule("req_hdr_Host_1", 32, 4, false, (IDCCoreVar)vars[1], false, "Host_366", null, 0, false);
	subContainer_14.addSubInstruction(sub_50);
		ISubRule sub_51 = new SubRule("req_hdr_Referer_1", 0, 72, false, (IDCCoreVar)dcVars[1], false, "Referer_183", null, 0, false);
	subContainer_14.addSubInstruction(sub_51);
		ISubRule sub_52 = new SubRule("req_hdr_Host_1", 0, 31, false, (IDCCoreVar)vars[0], false, "Host_365", null, 0, false);
	subContainer_14.addSubInstruction(sub_52);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E9440FC204BF5CDFEAE23864643438"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E9440FC204BF5CDFEAE23864643438"), 3);		
		IConnectionRecord serverConnection = ConnectionRecordFactory.find(parent, 
				parallelGroup, connConfigName,
				true, // close connection at test boundary,
				null, 0, 1); // error behavior
		reqAction.io2=serverConnection.getHttp2ioConnector();
		IHTTPRequest req = new HTTPRequest(
			"GET",	// method
			"https",  // protocol - http or https
			url, isURLRelative,
			"1.1",	// version
			headers,
			IHTTPSessionTypes.STANDARD,
			0, // delay
			isPrimary,
			null,// post data
			basicAuth,
			serverConnection,
			reqAction,
			"ISO-8859-1",
			"ISO-8859-1",
			"A1E9440FC20C87ADDFEAE23864643438",
			true,
			false
		);
		
		req.setExpectedResponseCode(304);
		req.setConnectionClose(connectionClose);
		

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("https//");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}

	public HTTPAction request_15(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1E9440FC20CFCAEDFEAE23864643438", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(8);
					
		headers.add(new RequestHeaderData("Host", "rptsvt-win21.nonprod.hclpnp.com:9443", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (X11; Linux x86_64; rv:65.0) Gecko/20100101 Firefox/65.0", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("Accept", "*/*", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.5", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("Referer", "https://rptsvt-win21.nonprod.hclpnp.com:9443/PlantsByWebSphere/promo.jsf", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("If-Modified-Since", "Fri, 22 Feb 2019 14:47:04 GMT", "ISO-8859-1", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_15 = new DataSub();
	reqAction.addDataSub(subContainer_15);

		ISubRule sub_53 = new SubRule("req_uri", 60, 18, true, (IDCCoreVar)dcVars[4], false, "ln", null, 0, false);
	subContainer_15.addSubInstruction(sub_53);
		ISubRule sub_54 = new SubRule("req_hdr_Host_1", 32, 4, false, (IDCCoreVar)vars[1], false, "Host_364", null, 0, false);
	subContainer_15.addSubInstruction(sub_54);
		ISubRule sub_55 = new SubRule("req_hdr_Referer_1", 0, 72, false, (IDCCoreVar)dcVars[1], false, "Referer_182", null, 0, false);
	subContainer_15.addSubInstruction(sub_55);
		ISubRule sub_56 = new SubRule("req_hdr_Host_1", 0, 31, false, (IDCCoreVar)vars[0], false, "Host_363", null, 0, false);
	subContainer_15.addSubInstruction(sub_56);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E9440FC204BF5CDFEAE23864643438"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E9440FC204BF5CDFEAE23864643438"), 3);		
		IConnectionRecord serverConnection = ConnectionRecordFactory.find(parent, 
				parallelGroup, connConfigName,
				true, // close connection at test boundary,
				null, 0, 1); // error behavior
		reqAction.io2=serverConnection.getHttp2ioConnector();
		IHTTPRequest req = new HTTPRequest(
			"GET",	// method
			"https",  // protocol - http or https
			url, isURLRelative,
			"1.1",	// version
			headers,
			IHTTPSessionTypes.STANDARD,
			0, // delay
			isPrimary,
			null,// post data
			basicAuth,
			serverConnection,
			reqAction,
			"ISO-8859-1",
			"ISO-8859-1",
			"A1E9440FC20CFCB1DFEAE23864643438",
			true,
			false
		);
		
		req.setExpectedResponseCode(200);
		req.setConnectionClose(connectionClose);
		

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("application/javascript");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}

	public HTTPAction request_16(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1E9440FC20D4ACEDFEAE23864643438", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(8);
					
		headers.add(new RequestHeaderData("Host", "rptsvt-win21.nonprod.hclpnp.com:9443", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (X11; Linux x86_64; rv:65.0) Gecko/20100101 Firefox/65.0", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("Accept", "image/webp,*/*", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.5", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("Referer", "https://rptsvt-win21.nonprod.hclpnp.com:9443/PlantsByWebSphere/promo.jsf", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("If-Modified-Since", "Mon, 16 Jan 2012 21:43:22 GMT", "ISO-8859-1", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_16 = new DataSub();
	reqAction.addDataSub(subContainer_16);

		ISubRule sub_57 = new SubRule("req_uri", 69, 6, true, (IDCCoreVar)dcVars[3], false, "ln", null, 0, false);
	subContainer_16.addSubInstruction(sub_57);
		ISubRule sub_58 = new SubRule("req_hdr_Host_1", 32, 4, false, (IDCCoreVar)vars[1], false, "Host_362", null, 0, false);
	subContainer_16.addSubInstruction(sub_58);
		ISubRule sub_59 = new SubRule("req_hdr_Referer_1", 0, 72, false, (IDCCoreVar)dcVars[1], false, "Referer_181", null, 0, false);
	subContainer_16.addSubInstruction(sub_59);
		ISubRule sub_60 = new SubRule("req_hdr_Host_1", 0, 31, false, (IDCCoreVar)vars[0], false, "Host_361", null, 0, false);
	subContainer_16.addSubInstruction(sub_60);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E9440FC204BF5CDFEAE23864643438"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E9440FC204BF5CDFEAE23864643438"), 3);		
		IConnectionRecord serverConnection = ConnectionRecordFactory.find(parent, 
				parallelGroup, connConfigName,
				true, // close connection at test boundary,
				null, 0, 1); // error behavior
		reqAction.io2=serverConnection.getHttp2ioConnector();
		IHTTPRequest req = new HTTPRequest(
			"GET",	// method
			"https",  // protocol - http or https
			url, isURLRelative,
			"1.1",	// version
			headers,
			IHTTPSessionTypes.STANDARD,
			0, // delay
			isPrimary,
			null,// post data
			basicAuth,
			serverConnection,
			reqAction,
			"ISO-8859-1",
			"ISO-8859-1",
			"A1E9440FC20D4AD1DFEAE23864643438",
			true,
			false
		);
		
		req.setExpectedResponseCode(304);
		req.setConnectionClose(connectionClose);
		

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("https//");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}

	public HTTPAction request_17(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1E9440FC20E0E1EDFEAE23864643438", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(8);
					
		headers.add(new RequestHeaderData("Host", "rptsvt-win21.nonprod.hclpnp.com:9443", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (X11; Linux x86_64; rv:65.0) Gecko/20100101 Firefox/65.0", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("Accept", "image/webp,*/*", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.5", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("Referer", "https://rptsvt-win21.nonprod.hclpnp.com:9443/PlantsByWebSphere/promo.jsf", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("If-Modified-Since", "Mon, 16 Jan 2012 21:43:22 GMT", "ISO-8859-1", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_17 = new DataSub();
	reqAction.addDataSub(subContainer_17);

		ISubRule sub_61 = new SubRule("req_uri", 65, 6, true, (IDCCoreVar)dcVars[3], false, "ln", null, 0, false);
	subContainer_17.addSubInstruction(sub_61);
		ISubRule sub_62 = new SubRule("req_hdr_Host_1", 32, 4, false, (IDCCoreVar)vars[1], false, "Host_360", null, 0, false);
	subContainer_17.addSubInstruction(sub_62);
		ISubRule sub_63 = new SubRule("req_hdr_Referer_1", 0, 72, false, (IDCCoreVar)dcVars[1], false, "Referer_180", null, 0, false);
	subContainer_17.addSubInstruction(sub_63);
		ISubRule sub_64 = new SubRule("req_hdr_Host_1", 0, 31, false, (IDCCoreVar)vars[0], false, "Host_359", null, 0, false);
	subContainer_17.addSubInstruction(sub_64);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E9440FC204BF5CDFEAE23864643438"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E9440FC204BF5CDFEAE23864643438"), 3);		
		IConnectionRecord serverConnection = ConnectionRecordFactory.find(parent, 
				parallelGroup, connConfigName,
				true, // close connection at test boundary,
				null, 0, 1); // error behavior
		reqAction.io2=serverConnection.getHttp2ioConnector();
		IHTTPRequest req = new HTTPRequest(
			"GET",	// method
			"https",  // protocol - http or https
			url, isURLRelative,
			"1.1",	// version
			headers,
			IHTTPSessionTypes.STANDARD,
			0, // delay
			isPrimary,
			null,// post data
			basicAuth,
			serverConnection,
			reqAction,
			"ISO-8859-1",
			"ISO-8859-1",
			"A1E9440FC20E0E21DFEAE23864643438",
			true,
			false
		);
		
		req.setExpectedResponseCode(304);
		req.setConnectionClose(connectionClose);
		

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("https//");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}
	private For Loop_1(IContainer parent) {
		For forLoop = new For(parent,
				 "Loop1",
				 "A1E94410996D3F70DFEAE23864643438",
				 -1,
				 0,
				 0,
				 0,
				 1,
				 true, 
				 false,
				 datapool_1(this)) {

			
		  
		    public void executeLoop() { 
		    	
	
	
	
	               
				this.add(page_2(this));
	this.add(page_3(this));
	this.add(page_4(this));
			super.executeLoop();
		    }
		
		};
		return forLoop;
	}
private HTTPPage page_2(final IContainer parent) {
			HTTPThink think = new HTTPThink(2652, 1, parent, parent, "A1E9440FC20E3553DFEAE23864643438");
	parent.add(think);
	
		HTTPPage page = new HTTPPage(parent, "Plants By WebSphere Shopping", "A1E9440FC20E3553DFEAE23864643438") {
			
			public void execute() {   
				
	
	
	
	
			             
			{ // Parallal Block Start
				HTTPParallel httpParallel = new HTTPParallel(6, this);
				this.add(httpParallel);

				// httpParallel.addRequest(int serial, HTTPAction action, int actionDelay, String firstCharSemID) 
				httpParallel.addRequest(0, request_18(this, true, "A1E9440FC204BF40DFEAE23864643438", false, true,
						"Config_1", "rptsvt-win21.nonprod.hclpnp.com:9443/PlantsByWebSphere/promo.jsf",	"/PlantsByWebSphere/promo.jsf", true, false), 0, 100, "null", 3);
				httpParallel.addRequest(1, request_19(this, false, "A1E9440FC20CFCA0DFEAE23864643438", false, false,
						"Config_1", "rptsvt-win21.nonprod.hclpnp.com:9443/PlantsByWebSphere/javax.faces.resource/PlantMaster.css.jsf?ln=theme",	"/PlantsByWebSphere/javax.faces.resource/PlantMaster.css.jsf?ln=theme", true, false), 21, 100, "A1E9440FC20E3557DFEAE23864643438", 2);
				httpParallel.addRequest(2, request_20(this, false, "A1E9440FC20B9D10DFEAE23864643438", false, false,
						"Config_1", "rptsvt-win21.nonprod.hclpnp.com:9443/PlantsByWebSphere/javax.faces.resource/oamSubmit.js.jsf?ln=org.apache.myfaces",	"/PlantsByWebSphere/javax.faces.resource/oamSubmit.js.jsf?ln=org.apache.myfaces", true, false), 22, 100, "A1E9440FC20E3557DFEAE23864643438", 2);
				httpParallel.addRequest(1, request_21(this, false, "A1E9440FC20CFCA0DFEAE23864643438", false, false,
						"Config_1", "rptsvt-win21.nonprod.hclpnp.com:9443/PlantsByWebSphere/javax.faces.resource/1x1_trans.gif.jsf?ln=images",	"/PlantsByWebSphere/javax.faces.resource/1x1_trans.gif.jsf?ln=images", true, false), 0, 100, "null", 3);
				httpParallel.addRequest(3, request_22(this, false, "A1E9440FC20C879CDFEAE23864643438", false, false,
						"Config_1", "rptsvt-win21.nonprod.hclpnp.com:9443/PlantsByWebSphere/javax.faces.resource/pbw.jpg.jsf?ln=images",	"/PlantsByWebSphere/javax.faces.resource/pbw.jpg.jsf?ln=images", true, false), 28, 100, "A1E9440FC20E3557DFEAE23864643438", 2);
				httpParallel.addRequest(4, request_23(this, false, "A1E9440FC20E0E10DFEAE23864643438", false, false,
						"Config_1", "rptsvt-win21.nonprod.hclpnp.com:9443/PlantsByWebSphere/javax.faces.resource/tab_veggies_u.gif.jsf?ln=images",	"/PlantsByWebSphere/javax.faces.resource/tab_veggies_u.gif.jsf?ln=images", true, false), 35, 100, "A1E9440FC20E3557DFEAE23864643438", 2);
				httpParallel.addRequest(5, request_24(this, false, "A1E9440FC20D4AC0DFEAE23864643438", false, false,
						"Config_1", "rptsvt-win21.nonprod.hclpnp.com:9443/PlantsByWebSphere/javax.faces.resource/tab_flowers_u.gif.jsf?ln=images",	"/PlantsByWebSphere/javax.faces.resource/tab_flowers_u.gif.jsf?ln=images", true, false), 35, 100, "A1E9440FC20E3557DFEAE23864643438", 2);
				httpParallel.addRequest(3, request_25(this, false, "A1E9440FC20C879CDFEAE23864643438", false, false,
						"Config_1", "rptsvt-win21.nonprod.hclpnp.com:9443/PlantsByWebSphere/javax.faces.resource/tab_accessories_u.gif.jsf?ln=images",	"/PlantsByWebSphere/javax.faces.resource/tab_accessories_u.gif.jsf?ln=images", true, false), 0, 100, "null", 3);
				httpParallel.addRequest(2, request_26(this, false, "A1E9440FC20B9D10DFEAE23864643438", false, false,
						"Config_1", "rptsvt-win21.nonprod.hclpnp.com:9443/PlantsByWebSphere/javax.faces.resource/tab_trees_u.gif.jsf?ln=images",	"/PlantsByWebSphere/javax.faces.resource/tab_trees_u.gif.jsf?ln=images", true, false), 0, 100, "null", 3);
				httpParallel.addRequest(1, request_27(this, false, "A1E9440FC20CFCA0DFEAE23864643438", false, false,
						"Config_1", "rptsvt-win21.nonprod.hclpnp.com:9443/PlantsByWebSphere/servlet/ImageServlet?action=getimage&inventoryID=F0001",	"/PlantsByWebSphere/servlet/ImageServlet?action=getimage&inventoryID=F0001", true, false), 0, 100, "null", 3);
				httpParallel.addRequest(0, request_28(this, false, "A1E9440FC204BF40DFEAE23864643438", false, false,
						"Config_1", "rptsvt-win21.nonprod.hclpnp.com:9443/PlantsByWebSphere/javax.faces.resource/poweredby_WebSphere.gif.jsf?ln=images",	"/PlantsByWebSphere/javax.faces.resource/poweredby_WebSphere.gif.jsf?ln=images", true, false), 0, 100, "null", 3);
				httpParallel.addRequest(3, request_29(this, false, "A1E9440FC20C879CDFEAE23864643438", false, false,
						"Config_1", "rptsvt-win21.nonprod.hclpnp.com:9443/PlantsByWebSphere/servlet/ImageServlet?action=getimage&inventoryID=F0003",	"/PlantsByWebSphere/servlet/ImageServlet?action=getimage&inventoryID=F0003", true, false), 0, 100, "null", 3);
				httpParallel.addRequest(4, request_30(this, false, "A1E9440FC20E0E10DFEAE23864643438", false, false,
						"Config_1", "rptsvt-win21.nonprod.hclpnp.com:9443/PlantsByWebSphere/servlet/ImageServlet?action=getimage&inventoryID=F0015",	"/PlantsByWebSphere/servlet/ImageServlet?action=getimage&inventoryID=F0015", true, false), 0, 100, "null", 3);
				httpParallel.addRequest(1, request_31(this, false, "A1E9440FC20CFCA0DFEAE23864643438", false, false,
						"Config_1", "rptsvt-win21.nonprod.hclpnp.com:9443/PlantsByWebSphere/servlet/ImageServlet?action=getimage&inventoryID=F0018",	"/PlantsByWebSphere/servlet/ImageServlet?action=getimage&inventoryID=F0018", true, false), 0, 100, "null", 3);
				httpParallel.addRequest(3, request_32(this, false, "A1E9440FC20C879CDFEAE23864643438", false, false,
						"Config_1", "rptsvt-win21.nonprod.hclpnp.com:9443/PlantsByWebSphere/servlet/ImageServlet?action=getimage&inventoryID=F0004",	"/PlantsByWebSphere/servlet/ImageServlet?action=getimage&inventoryID=F0004", true, false), 111, 100, "A1E9440FC20E3557DFEAE23864643438", 2);
				httpParallel.addRequest(4, request_33(this, false, "A1E9440FC20E0E10DFEAE23864643438", false, false,
						"Config_1", "rptsvt-win21.nonprod.hclpnp.com:9443/PlantsByWebSphere/servlet/ImageServlet?action=getimage&inventoryID=F0002",	"/PlantsByWebSphere/servlet/ImageServlet?action=getimage&inventoryID=F0002", true, false), 0, 100, "null", 3);
				httpParallel.addRequest(5, request_34(this, false, "A1E9440FC20D4AC0DFEAE23864643438", false, false,
						"Config_1", "rptsvt-win21.nonprod.hclpnp.com:9443/PlantsByWebSphere/servlet/ImageServlet?action=getimage&inventoryID=F0005",	"/PlantsByWebSphere/servlet/ImageServlet?action=getimage&inventoryID=F0005", true, false), 113, 100, "A1E9440FC20E3557DFEAE23864643438", 2);
				httpParallel.addRequest(2, request_35(this, false, "A1E9440FC20B9D10DFEAE23864643438", false, false,
						"Config_1", "rptsvt-win21.nonprod.hclpnp.com:9443/PlantsByWebSphere/servlet/ImageServlet?action=getimage&inventoryID=F0006",	"/PlantsByWebSphere/servlet/ImageServlet?action=getimage&inventoryID=F0006", true, false), 131, 100, "A1E9440FC20E3557DFEAE23864643438", 2);
				httpParallel.addRequest(0, request_36(this, false, "A1E9440FC204BF40DFEAE23864643438", false, false,
						"Config_1", "rptsvt-win21.nonprod.hclpnp.com:9443/PlantsByWebSphere/servlet/ImageServlet?action=getimage&inventoryID=F0008",	"/PlantsByWebSphere/servlet/ImageServlet?action=getimage&inventoryID=F0008", true, false), 145, 100, "A1E9440FC20E3557DFEAE23864643438", 2);
				httpParallel.addRequest(5, request_37(this, false, "A1E9440FC20D4AC0DFEAE23864643438", false, false,
						"Config_1", "rptsvt-win21.nonprod.hclpnp.com:9443/PlantsByWebSphere/servlet/ImageServlet?action=getimage&inventoryID=F0007",	"/PlantsByWebSphere/servlet/ImageServlet?action=getimage&inventoryID=F0007", true, false), 0, 100, "null", 3);
				httpParallel.addRequest(2, request_38(this, false, "A1E9440FC20B9D10DFEAE23864643438", false, false,
						"Config_1", "rptsvt-win21.nonprod.hclpnp.com:9443/PlantsByWebSphere/servlet/ImageServlet?action=getimage&inventoryID=F0009",	"/PlantsByWebSphere/servlet/ImageServlet?action=getimage&inventoryID=F0009", true, false), 0, 100, "null", 3);
				httpParallel.addRequest(1, request_39(this, false, "A1E9440FC20CFCA0DFEAE23864643438", false, false,
						"Config_1", "rptsvt-win21.nonprod.hclpnp.com:9443/PlantsByWebSphere/servlet/ImageServlet?action=getimage&inventoryID=F0010",	"/PlantsByWebSphere/servlet/ImageServlet?action=getimage&inventoryID=F0010", true, false), 170, 100, "A1E9440FC20E3557DFEAE23864643438", 2);
				httpParallel.addRequest(3, request_40(this, false, "A1E9440FC20C879CDFEAE23864643438", false, false,
						"Config_1", "rptsvt-win21.nonprod.hclpnp.com:9443/PlantsByWebSphere/servlet/ImageServlet?action=getimage&inventoryID=F0011",	"/PlantsByWebSphere/servlet/ImageServlet?action=getimage&inventoryID=F0011", true, false), 171, 100, "A1E9440FC20E3557DFEAE23864643438", 2);
				httpParallel.addRequest(4, request_41(this, false, "A1E9440FC20E0E10DFEAE23864643438", false, false,
						"Config_1", "rptsvt-win21.nonprod.hclpnp.com:9443/PlantsByWebSphere/servlet/ImageServlet?action=getimage&inventoryID=F0012",	"/PlantsByWebSphere/servlet/ImageServlet?action=getimage&inventoryID=F0012", true, false), 172, 100, "A1E9440FC20E3557DFEAE23864643438", 2);
				httpParallel.addRequest(0, request_42(this, false, "A1E9440FC204BF40DFEAE23864643438", false, false,
						"Config_1", "rptsvt-win21.nonprod.hclpnp.com:9443/PlantsByWebSphere/servlet/ImageServlet?action=getimage&inventoryID=F0013",	"/PlantsByWebSphere/servlet/ImageServlet?action=getimage&inventoryID=F0013", true, false), 0, 100, "null", 3);
				httpParallel.addRequest(5, request_43(this, false, "A1E9440FC20D4AC0DFEAE23864643438", false, false,
						"Config_1", "rptsvt-win21.nonprod.hclpnp.com:9443/PlantsByWebSphere/servlet/ImageServlet?action=getimage&inventoryID=F0014",	"/PlantsByWebSphere/servlet/ImageServlet?action=getimage&inventoryID=F0014", true, false), 0, 100, "null", 3);
				httpParallel.addRequest(1, request_44(this, false, "A1E9440FC20CFCA0DFEAE23864643438", false, false,
						"Config_1", "rptsvt-win21.nonprod.hclpnp.com:9443/PlantsByWebSphere/servlet/ImageServlet?action=getimage&inventoryID=F0016",	"/PlantsByWebSphere/servlet/ImageServlet?action=getimage&inventoryID=F0016", true, false), 0, 100, "null", 3);
				httpParallel.addRequest(2, request_45(this, false, "A1E9440FC20B9D10DFEAE23864643438", false, false,
						"Config_1", "rptsvt-win21.nonprod.hclpnp.com:9443/PlantsByWebSphere/servlet/ImageServlet?action=getimage&inventoryID=F0017",	"/PlantsByWebSphere/servlet/ImageServlet?action=getimage&inventoryID=F0017", true, false), 0, 100, "null", 3);
				httpParallel.addRequest(4, request_46(this, false, "A1E9440FC20E0E10DFEAE23864643438", false, false,
						"Config_1", "rptsvt-win21.nonprod.hclpnp.com:9443/PlantsByWebSphere/servlet/ImageServlet?action=getimage&inventoryID=F0019",	"/PlantsByWebSphere/servlet/ImageServlet?action=getimage&inventoryID=F0019", true, false), 0, 100, "null", 3);
				httpParallel.addRequest(0, request_47(this, false, "A1E9440FC204BF40DFEAE23864643438", false, false,
						"Config_1", "rptsvt-win21.nonprod.hclpnp.com:9443/PlantsByWebSphere/servlet/ImageServlet?action=getimage&inventoryID=F0020",	"/PlantsByWebSphere/servlet/ImageServlet?action=getimage&inventoryID=F0020", true, false), 0, 100, "null", 3);
			} // Parallal Block End 

			
				super.execute();
			}
		};
		
		
		page.setRemoveDelaysFromPageResponseTimes(false);
		page.setArmEnabled(false);  
		return page;
	}

	public HTTPAction request_18(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1E9440FC20E3557DFEAE23864643438", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(10);
					
		headers.add(new RequestHeaderData("Host", "rptsvt-win21.nonprod.hclpnp.com:9443", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (X11; Linux x86_64; rv:65.0) Gecko/20100101 Firefox/65.0", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("Accept", "text/html,application/xhtml+xml,application/xml;q=0.9,image/webp,*/*;q=0.8", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.5", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("Referer", "https://rptsvt-win21.nonprod.hclpnp.com:9443/PlantsByWebSphere/promo.jsf", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("Content-Type", "application/x-www-form-urlencoded", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("Content-Length", "243", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("Upgrade-Insecure-Requests", "1", "ISO-8859-1", 1));

				
			HTTPPostData postData = new HTTPPostData(reqAction, 0);
	
			postDataClass_1(postData);
				
		IBasicAuthentication basicAuth = null;
			IDataHarvester harvestContainer_2 = new DataHarvester();
	reqAction.addDataHarvester (harvestContainer_2);

	harvestContainer_2.addHarvestInstruction ("resp_hdr_Referer-RPT-Generated (read-only)_1", dcVars[7], ".*", 1, 0, 0, 0, false, "Referer-RPT-Generated (read-only)_2", null, 0, false);
	harvestContainer_2.addHarvestInstruction ("resp_content", dcVars[8], "\\?ln=(.*?)\"", 1, 1, 0, 0, false, "ln_127", null, 0, false);
	harvestContainer_2.addHarvestInstruction ("resp_content", dcVars[9], "\\?ln=(.*?)\"", 2, 1, 0, 0, false, "ln_125", null, 0, false);
	harvestContainer_2.addHarvestInstruction ("resp_content", dcVars[10], "\\?ln=(.*?)\"", 6, 4, 0, 0, false, "ln_126", null, 0, false);
	harvestContainer_2.addHarvestInstruction ("resp_content", dcVars[11], "<[[^>].]*?name=\"javax\\.faces\\.ViewState\"(([[^>].]*?value=\"(.*?)\")|(?:[[^>].]*?>))", 1, 1, 0, 0, false, "value_4", null, 0, false);
	harvestContainer_2.addHarvestInstruction ("resp_content", dcVars[12], "\\?action=(.*?)&", 1, 1, 0, 0, false, "action_64", null, 0, false);
	harvestContainer_2.addHarvestInstruction ("resp_content", dcVars[13], ";inventoryID=(.*?)\"", 1, 1, 0, 0, false, "inventoryID_83", null, 0, false);
	harvestContainer_2.addHarvestInstruction ("resp_content", dcVars[14], ";inventoryID=(.*?)\"", 2, 1, 0, 0, false, "inventoryID_78", null, 0, false);
	harvestContainer_2.addHarvestInstruction ("resp_content", dcVars[15], ";inventoryID=(.*?)\"", 3, 1, 0, 0, false, "inventoryID_82", null, 0, false);
	harvestContainer_2.addHarvestInstruction ("resp_content", dcVars[16], ";inventoryID=(.*?)\"", 4, 1, 0, 0, false, "inventoryID_79", null, 0, false);
	harvestContainer_2.addHarvestInstruction ("resp_content", dcVars[17], ";inventoryID=(.*?)\"", 5, 1, 0, 0, false, "inventoryID_77", null, 0, false);
	harvestContainer_2.addHarvestInstruction ("resp_content", dcVars[18], ";inventoryID=(.*?)\"", 6, 1, 0, 0, false, "inventoryID_76", null, 0, false);
	harvestContainer_2.addHarvestInstruction ("resp_content", dcVars[19], ";inventoryID=(.*?)\"", 7, 1, 0, 0, false, "inventoryID_74", null, 0, false);
	harvestContainer_2.addHarvestInstruction ("resp_content", dcVars[20], ";inventoryID=(.*?)\"", 8, 1, 0, 0, false, "inventoryID_75", null, 0, false);
	harvestContainer_2.addHarvestInstruction ("resp_content", dcVars[21], ";inventoryID=(.*?)\"", 9, 1, 0, 0, false, "inventoryID_73", null, 0, false);
	harvestContainer_2.addHarvestInstruction ("resp_content", dcVars[22], ";inventoryID=(.*?)\"", 10, 1, 0, 0, false, "inventoryID_72", null, 0, false);
	harvestContainer_2.addHarvestInstruction ("resp_content", dcVars[23], ";inventoryID=(.*?)\"", 11, 1, 0, 0, false, "inventoryID_71", null, 0, false);
	harvestContainer_2.addHarvestInstruction ("resp_content", dcVars[24], ";inventoryID=(.*?)\"", 12, 1, 0, 0, false, "inventoryID_70", null, 0, false);
	harvestContainer_2.addHarvestInstruction ("resp_content", dcVars[25], ";inventoryID=(.*?)\"", 13, 1, 0, 0, false, "inventoryID_69", null, 0, false);
	harvestContainer_2.addHarvestInstruction ("resp_content", dcVars[26], ";inventoryID=(.*?)\"", 14, 1, 0, 0, false, "inventoryID_68", null, 0, false);
	harvestContainer_2.addHarvestInstruction ("resp_content", dcVars[27], ";inventoryID=(.*?)\"", 15, 1, 0, 0, false, "inventoryID_81", null, 0, false);
	harvestContainer_2.addHarvestInstruction ("resp_content", dcVars[28], ";inventoryID=(.*?)\"", 16, 1, 0, 0, false, "inventoryID_67", null, 0, false);
	harvestContainer_2.addHarvestInstruction ("resp_content", dcVars[29], ";inventoryID=(.*?)\"", 17, 1, 0, 0, false, "inventoryID_66", null, 0, false);
	harvestContainer_2.addHarvestInstruction ("resp_content", dcVars[30], ";inventoryID=(.*?)\"", 18, 1, 0, 0, false, "inventoryID_80", null, 0, false);
	harvestContainer_2.addHarvestInstruction ("resp_content", dcVars[31], ";inventoryID=(.*?)\"", 19, 1, 0, 0, false, "inventoryID_65", null, 0, false);
	harvestContainer_2.addHarvestInstruction ("resp_content", dcVars[32], ";inventoryID=(.*?)\"", 20, 1, 0, 0, false, "inventoryID_64", null, 0, false);
	harvestContainer_2.addHarvestInstruction ("resp_content", dcVars[33], "<[[^>].]*?name=\"shopping_SUBMIT\"(([[^>].]*?value=\"(.*?)\")|(?:[[^>].]*?>))", 1, 1, 0, 0, false, "value_3", null, 0, false);
	IDataSub subContainer_19 = new DataSub();
	reqAction.addDataSub(subContainer_19);

		ISubRule sub_67 = new SubRule("req_hdr_Host_1", 32, 4, false, (IDCCoreVar)vars[1], false, "Host_358", null, 0, false);
	subContainer_19.addSubInstruction(sub_67);
		ISubRule sub_68 = new SubRule("req_hdr_Referer_1", 0, 72, false, (IDCCoreVar)dcVars[1], false, "Referer_179", null, 0, false);
	subContainer_19.addSubInstruction(sub_68);
		ISubRule sub_69 = new SubRule("req_hdr_Host_1", 0, 31, false, (IDCCoreVar)vars[0], false, "Host_357", null, 0, false);
	subContainer_19.addSubInstruction(sub_69);
	


		
				
		IConnectionRecord serverConnection = ConnectionRecordFactory.find(parent, 
				parallelGroup, connConfigName,
				true, // close connection at test boundary,
				null, 0, 1); // error behavior
		reqAction.io2=serverConnection.getHttp2ioConnector();
		IHTTPRequest req = new HTTPRequest(
			"POST",	// method
			"https",  // protocol - http or https
			url, isURLRelative,
			"1.1",	// version
			headers,
			IHTTPSessionTypes.STANDARD,
			0, // delay
			isPrimary,
			postData,// post data
			basicAuth,
			serverConnection,
			reqAction,
			"ISO-8859-1",
			"ISO-8859-1",
			"A1E9440FC20E355ADFEAE23864643438",
			true,
			false
		);
		
		req.setExpectedResponseCode(200);
		req.setConnectionClose(connectionClose);
		

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("text/html; charset=ISO-8859-1");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(true);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}
	private void postDataClass_1(HTTPPostData postData) {
				StringBuffer strBuf_1 = new StringBuffer();
strBuf_1.append("bannerform_SUBMIT=1&javax.faces.ViewState=JOdHD0Nf8TsYahcFj5");
strBuf_1.append("0DfrpkzkvewAuNQNXTWRtgRZi1W6hd%2FpyfUsfTtGhKb46A37clTg%2BpSk");
strBuf_1.append("gDdecSMEmZ2HeCFMO35xEz1eHVsoih%2F8zC9FR0TY%2FYUDcGeaE%3D&cat");
strBuf_1.append("egory=0&bannerform%3A_idcl=bannerform%3Aj_id1717086759_3a23d");
strBuf_1.append("0b4");
String requestData_1 = strBuf_1.toString();
			
	HTTPPostDataChunk pdc_0 = new HTTPPostDataChunk("A1E9440FC20E8340DFEAE23864643438", postData, requestData_1, "ISO-8859-1", 135, 176);
	postData.addDataChunk(pdc_0);

	IDataSub subContainer_18 = new DataSub();
	pdc_0.addDataSub(subContainer_18);

		ISubRule sub_65 = new SubRule("req_content", 42, 134, true, (IDCCoreVar)dcVars[6], false, "javax.faces.ViewState", null, 0, false);
	subContainer_18.addSubInstruction(sub_65);
		ISubRule sub_66 = new SubRule("req_content", 18, 1, true, (IDCCoreVar)dcVars[5], false, "bannerform_SUBMIT", null, 0, false);
	subContainer_18.addSubInstruction(sub_66);
	



	}

	public HTTPAction request_19(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1E9440FC20EAA7EDFEAE23864643438", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(8);
					
		headers.add(new RequestHeaderData("Host", "rptsvt-win21.nonprod.hclpnp.com:9443", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (X11; Linux x86_64; rv:65.0) Gecko/20100101 Firefox/65.0", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("Accept", "text/css,*/*;q=0.1", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.5", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("Referer", "https://rptsvt-win21.nonprod.hclpnp.com:9443/PlantsByWebSphere/promo.jsf", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("If-Modified-Since", "Tue, 26 Feb 2019 20:52:28 GMT", "ISO-8859-1", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_20 = new DataSub();
	reqAction.addDataSub(subContainer_20);

		ISubRule sub_70 = new SubRule("req_uri", 63, 5, true, (IDCCoreVar)dcVars[8], false, "ln", null, 0, false);
	subContainer_20.addSubInstruction(sub_70);
		ISubRule sub_71 = new SubRule("req_hdr_Host_1", 32, 4, false, (IDCCoreVar)vars[1], false, "Host_356", null, 0, false);
	subContainer_20.addSubInstruction(sub_71);
		ISubRule sub_72 = new SubRule("req_hdr_Referer_1", 0, 72, false, (IDCCoreVar)dcVars[7], false, "Referer_178", null, 0, false);
	subContainer_20.addSubInstruction(sub_72);
		ISubRule sub_73 = new SubRule("req_hdr_Host_1", 0, 31, false, (IDCCoreVar)vars[0], false, "Host_355", null, 0, false);
	subContainer_20.addSubInstruction(sub_73);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E9440FC20E3557DFEAE23864643438"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E9440FC20E3557DFEAE23864643438"), 3);		
		IConnectionRecord serverConnection = ConnectionRecordFactory.find(parent, 
				parallelGroup, connConfigName,
				true, // close connection at test boundary,
				null, 0, 1); // error behavior
		reqAction.io2=serverConnection.getHttp2ioConnector();
		IHTTPRequest req = new HTTPRequest(
			"GET",	// method
			"https",  // protocol - http or https
			url, isURLRelative,
			"1.1",	// version
			headers,
			IHTTPSessionTypes.STANDARD,
			0, // delay
			isPrimary,
			null,// post data
			basicAuth,
			serverConnection,
			reqAction,
			"ISO-8859-1",
			"ISO-8859-1",
			"A1E9440FC20EAA81DFEAE23864643438",
			true,
			false
		);
		
		req.setExpectedResponseCode(304);
		req.setConnectionClose(connectionClose);
		

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("https//");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}

	public HTTPAction request_20(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1E9440FC20ED1A3DFEAE23864643438", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(8);
					
		headers.add(new RequestHeaderData("Host", "rptsvt-win21.nonprod.hclpnp.com:9443", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (X11; Linux x86_64; rv:65.0) Gecko/20100101 Firefox/65.0", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("Accept", "*/*", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.5", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("Referer", "https://rptsvt-win21.nonprod.hclpnp.com:9443/PlantsByWebSphere/promo.jsf", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("If-Modified-Since", "Tue, 26 Feb 2019 20:52:28 GMT", "ISO-8859-1", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_21 = new DataSub();
	reqAction.addDataSub(subContainer_21);

		ISubRule sub_74 = new SubRule("req_uri", 60, 18, true, (IDCCoreVar)dcVars[10], false, "ln", null, 0, false);
	subContainer_21.addSubInstruction(sub_74);
		ISubRule sub_75 = new SubRule("req_hdr_Host_1", 32, 4, false, (IDCCoreVar)vars[1], false, "Host_354", null, 0, false);
	subContainer_21.addSubInstruction(sub_75);
		ISubRule sub_76 = new SubRule("req_hdr_Referer_1", 0, 72, false, (IDCCoreVar)dcVars[7], false, "Referer_177", null, 0, false);
	subContainer_21.addSubInstruction(sub_76);
		ISubRule sub_77 = new SubRule("req_hdr_Host_1", 0, 31, false, (IDCCoreVar)vars[0], false, "Host_353", null, 0, false);
	subContainer_21.addSubInstruction(sub_77);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E9440FC20E3557DFEAE23864643438"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E9440FC20E3557DFEAE23864643438"), 3);		
		IConnectionRecord serverConnection = ConnectionRecordFactory.find(parent, 
				parallelGroup, connConfigName,
				true, // close connection at test boundary,
				null, 0, 1); // error behavior
		reqAction.io2=serverConnection.getHttp2ioConnector();
		IHTTPRequest req = new HTTPRequest(
			"GET",	// method
			"https",  // protocol - http or https
			url, isURLRelative,
			"1.1",	// version
			headers,
			IHTTPSessionTypes.STANDARD,
			0, // delay
			isPrimary,
			null,// post data
			basicAuth,
			serverConnection,
			reqAction,
			"ISO-8859-1",
			"ISO-8859-1",
			"A1E9440FC20ED1A6DFEAE23864643438",
			true,
			false
		);
		
		req.setExpectedResponseCode(304);
		req.setConnectionClose(connectionClose);
		

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("https//");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}

	public HTTPAction request_21(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1E9440FC20EF891DFEAE23864643438", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(8);
					
		headers.add(new RequestHeaderData("Host", "rptsvt-win21.nonprod.hclpnp.com:9443", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (X11; Linux x86_64; rv:65.0) Gecko/20100101 Firefox/65.0", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("Accept", "image/webp,*/*", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.5", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("Referer", "https://rptsvt-win21.nonprod.hclpnp.com:9443/PlantsByWebSphere/promo.jsf", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("If-Modified-Since", "Mon, 16 Jan 2012 21:43:22 GMT", "ISO-8859-1", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_22 = new DataSub();
	reqAction.addDataSub(subContainer_22);

		ISubRule sub_78 = new SubRule("req_uri", 61, 6, true, (IDCCoreVar)dcVars[9], false, "ln", null, 0, false);
	subContainer_22.addSubInstruction(sub_78);
		ISubRule sub_79 = new SubRule("req_hdr_Host_1", 32, 4, false, (IDCCoreVar)vars[1], false, "Host_352", null, 0, false);
	subContainer_22.addSubInstruction(sub_79);
		ISubRule sub_80 = new SubRule("req_hdr_Referer_1", 0, 72, false, (IDCCoreVar)dcVars[7], false, "Referer_176", null, 0, false);
	subContainer_22.addSubInstruction(sub_80);
		ISubRule sub_81 = new SubRule("req_hdr_Host_1", 0, 31, false, (IDCCoreVar)vars[0], false, "Host_351", null, 0, false);
	subContainer_22.addSubInstruction(sub_81);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E9440FC20E3557DFEAE23864643438"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E9440FC20E3557DFEAE23864643438"), 3);		
		IConnectionRecord serverConnection = ConnectionRecordFactory.find(parent, 
				parallelGroup, connConfigName,
				true, // close connection at test boundary,
				null, 0, 1); // error behavior
		reqAction.io2=serverConnection.getHttp2ioConnector();
		IHTTPRequest req = new HTTPRequest(
			"GET",	// method
			"https",  // protocol - http or https
			url, isURLRelative,
			"1.1",	// version
			headers,
			IHTTPSessionTypes.STANDARD,
			0, // delay
			isPrimary,
			null,// post data
			basicAuth,
			serverConnection,
			reqAction,
			"ISO-8859-1",
			"ISO-8859-1",
			"A1E9440FC20EF894DFEAE23864643438",
			true,
			false
		);
		
		req.setExpectedResponseCode(304);
		req.setConnectionClose(connectionClose);
		

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("https//");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}

	public HTTPAction request_22(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1E9440FC20F94B0DFEAE23864643438", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(8);
					
		headers.add(new RequestHeaderData("Host", "rptsvt-win21.nonprod.hclpnp.com:9443", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (X11; Linux x86_64; rv:65.0) Gecko/20100101 Firefox/65.0", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("Accept", "image/webp,*/*", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.5", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("Referer", "https://rptsvt-win21.nonprod.hclpnp.com:9443/PlantsByWebSphere/promo.jsf", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("If-Modified-Since", "Mon, 16 Jan 2012 21:43:22 GMT", "ISO-8859-1", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_23 = new DataSub();
	reqAction.addDataSub(subContainer_23);

		ISubRule sub_82 = new SubRule("req_uri", 55, 6, true, (IDCCoreVar)dcVars[9], false, "ln", null, 0, false);
	subContainer_23.addSubInstruction(sub_82);
		ISubRule sub_83 = new SubRule("req_hdr_Host_1", 32, 4, false, (IDCCoreVar)vars[1], false, "Host_350", null, 0, false);
	subContainer_23.addSubInstruction(sub_83);
		ISubRule sub_84 = new SubRule("req_hdr_Referer_1", 0, 72, false, (IDCCoreVar)dcVars[7], false, "Referer_175", null, 0, false);
	subContainer_23.addSubInstruction(sub_84);
		ISubRule sub_85 = new SubRule("req_hdr_Host_1", 0, 31, false, (IDCCoreVar)vars[0], false, "Host_349", null, 0, false);
	subContainer_23.addSubInstruction(sub_85);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E9440FC20E3557DFEAE23864643438"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E9440FC20E3557DFEAE23864643438"), 3);		
		IConnectionRecord serverConnection = ConnectionRecordFactory.find(parent, 
				parallelGroup, connConfigName,
				true, // close connection at test boundary,
				null, 0, 1); // error behavior
		reqAction.io2=serverConnection.getHttp2ioConnector();
		IHTTPRequest req = new HTTPRequest(
			"GET",	// method
			"https",  // protocol - http or https
			url, isURLRelative,
			"1.1",	// version
			headers,
			IHTTPSessionTypes.STANDARD,
			0, // delay
			isPrimary,
			null,// post data
			basicAuth,
			serverConnection,
			reqAction,
			"ISO-8859-1",
			"ISO-8859-1",
			"A1E9440FC20F94B3DFEAE23864643438",
			true,
			false
		);
		
		req.setExpectedResponseCode(304);
		req.setConnectionClose(connectionClose);
		

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("https//");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}

	public HTTPAction request_23(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1E9440FC2107F10DFEAE23864643438", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(8);
					
		headers.add(new RequestHeaderData("Host", "rptsvt-win21.nonprod.hclpnp.com:9443", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (X11; Linux x86_64; rv:65.0) Gecko/20100101 Firefox/65.0", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("Accept", "image/webp,*/*", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.5", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("Referer", "https://rptsvt-win21.nonprod.hclpnp.com:9443/PlantsByWebSphere/promo.jsf", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("If-Modified-Since", "Mon, 16 Jan 2012 21:43:22 GMT", "ISO-8859-1", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_24 = new DataSub();
	reqAction.addDataSub(subContainer_24);

		ISubRule sub_86 = new SubRule("req_uri", 65, 6, true, (IDCCoreVar)dcVars[9], false, "ln", null, 0, false);
	subContainer_24.addSubInstruction(sub_86);
		ISubRule sub_87 = new SubRule("req_hdr_Host_1", 32, 4, false, (IDCCoreVar)vars[1], false, "Host_348", null, 0, false);
	subContainer_24.addSubInstruction(sub_87);
		ISubRule sub_88 = new SubRule("req_hdr_Referer_1", 0, 72, false, (IDCCoreVar)dcVars[7], false, "Referer_174", null, 0, false);
	subContainer_24.addSubInstruction(sub_88);
		ISubRule sub_89 = new SubRule("req_hdr_Host_1", 0, 31, false, (IDCCoreVar)vars[0], false, "Host_347", null, 0, false);
	subContainer_24.addSubInstruction(sub_89);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E9440FC20E3557DFEAE23864643438"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E9440FC20E3557DFEAE23864643438"), 3);		
		IConnectionRecord serverConnection = ConnectionRecordFactory.find(parent, 
				parallelGroup, connConfigName,
				true, // close connection at test boundary,
				null, 0, 1); // error behavior
		reqAction.io2=serverConnection.getHttp2ioConnector();
		IHTTPRequest req = new HTTPRequest(
			"GET",	// method
			"https",  // protocol - http or https
			url, isURLRelative,
			"1.1",	// version
			headers,
			IHTTPSessionTypes.STANDARD,
			0, // delay
			isPrimary,
			null,// post data
			basicAuth,
			serverConnection,
			reqAction,
			"ISO-8859-1",
			"ISO-8859-1",
			"A1E9440FC2107F13DFEAE23864643438",
			true,
			false
		);
		
		req.setExpectedResponseCode(304);
		req.setConnectionClose(connectionClose);
		

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("https//");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}

	public HTTPAction request_24(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1E9440FC210A647DFEAE23864643438", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(8);
					
		headers.add(new RequestHeaderData("Host", "rptsvt-win21.nonprod.hclpnp.com:9443", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (X11; Linux x86_64; rv:65.0) Gecko/20100101 Firefox/65.0", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("Accept", "image/webp,*/*", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.5", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("Referer", "https://rptsvt-win21.nonprod.hclpnp.com:9443/PlantsByWebSphere/promo.jsf", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("If-Modified-Since", "Mon, 16 Jan 2012 21:43:20 GMT", "ISO-8859-1", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_25 = new DataSub();
	reqAction.addDataSub(subContainer_25);

		ISubRule sub_90 = new SubRule("req_uri", 65, 6, true, (IDCCoreVar)dcVars[9], false, "ln", null, 0, false);
	subContainer_25.addSubInstruction(sub_90);
		ISubRule sub_91 = new SubRule("req_hdr_Host_1", 32, 4, false, (IDCCoreVar)vars[1], false, "Host_346", null, 0, false);
	subContainer_25.addSubInstruction(sub_91);
		ISubRule sub_92 = new SubRule("req_hdr_Referer_1", 0, 72, false, (IDCCoreVar)dcVars[7], false, "Referer_173", null, 0, false);
	subContainer_25.addSubInstruction(sub_92);
		ISubRule sub_93 = new SubRule("req_hdr_Host_1", 0, 31, false, (IDCCoreVar)vars[0], false, "Host_345", null, 0, false);
	subContainer_25.addSubInstruction(sub_93);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E9440FC20E3557DFEAE23864643438"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E9440FC20E3557DFEAE23864643438"), 3);		
		IConnectionRecord serverConnection = ConnectionRecordFactory.find(parent, 
				parallelGroup, connConfigName,
				true, // close connection at test boundary,
				null, 0, 1); // error behavior
		reqAction.io2=serverConnection.getHttp2ioConnector();
		IHTTPRequest req = new HTTPRequest(
			"GET",	// method
			"https",  // protocol - http or https
			url, isURLRelative,
			"1.1",	// version
			headers,
			IHTTPSessionTypes.STANDARD,
			0, // delay
			isPrimary,
			null,// post data
			basicAuth,
			serverConnection,
			reqAction,
			"ISO-8859-1",
			"ISO-8859-1",
			"A1E9440FC210A64ADFEAE23864643438",
			true,
			false
		);
		
		req.setExpectedResponseCode(304);
		req.setConnectionClose(connectionClose);
		

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("https//");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}

	public HTTPAction request_25(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1E9440FC2111B50DFEAE23864643438", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(8);
					
		headers.add(new RequestHeaderData("Host", "rptsvt-win21.nonprod.hclpnp.com:9443", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (X11; Linux x86_64; rv:65.0) Gecko/20100101 Firefox/65.0", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("Accept", "image/webp,*/*", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.5", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("Referer", "https://rptsvt-win21.nonprod.hclpnp.com:9443/PlantsByWebSphere/promo.jsf", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("If-Modified-Since", "Mon, 16 Jan 2012 21:43:20 GMT", "ISO-8859-1", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_26 = new DataSub();
	reqAction.addDataSub(subContainer_26);

		ISubRule sub_94 = new SubRule("req_uri", 69, 6, true, (IDCCoreVar)dcVars[9], false, "ln", null, 0, false);
	subContainer_26.addSubInstruction(sub_94);
		ISubRule sub_95 = new SubRule("req_hdr_Host_1", 32, 4, false, (IDCCoreVar)vars[1], false, "Host_344", null, 0, false);
	subContainer_26.addSubInstruction(sub_95);
		ISubRule sub_96 = new SubRule("req_hdr_Referer_1", 0, 72, false, (IDCCoreVar)dcVars[7], false, "Referer_172", null, 0, false);
	subContainer_26.addSubInstruction(sub_96);
		ISubRule sub_97 = new SubRule("req_hdr_Host_1", 0, 31, false, (IDCCoreVar)vars[0], false, "Host_343", null, 0, false);
	subContainer_26.addSubInstruction(sub_97);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E9440FC20E3557DFEAE23864643438"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E9440FC20E3557DFEAE23864643438"), 3);		
		IConnectionRecord serverConnection = ConnectionRecordFactory.find(parent, 
				parallelGroup, connConfigName,
				true, // close connection at test boundary,
				null, 0, 1); // error behavior
		reqAction.io2=serverConnection.getHttp2ioConnector();
		IHTTPRequest req = new HTTPRequest(
			"GET",	// method
			"https",  // protocol - http or https
			url, isURLRelative,
			"1.1",	// version
			headers,
			IHTTPSessionTypes.STANDARD,
			0, // delay
			isPrimary,
			null,// post data
			basicAuth,
			serverConnection,
			reqAction,
			"ISO-8859-1",
			"ISO-8859-1",
			"A1E9440FC2111B53DFEAE23864643438",
			true,
			false
		);
		
		req.setExpectedResponseCode(304);
		req.setConnectionClose(connectionClose);
		

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("https//");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}

	public HTTPAction request_26(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1E9440FC2114279DFEAE23864643438", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(8);
					
		headers.add(new RequestHeaderData("Host", "rptsvt-win21.nonprod.hclpnp.com:9443", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (X11; Linux x86_64; rv:65.0) Gecko/20100101 Firefox/65.0", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("Accept", "image/webp,*/*", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.5", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("Referer", "https://rptsvt-win21.nonprod.hclpnp.com:9443/PlantsByWebSphere/promo.jsf", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("If-Modified-Since", "Mon, 16 Jan 2012 21:43:22 GMT", "ISO-8859-1", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_27 = new DataSub();
	reqAction.addDataSub(subContainer_27);

		ISubRule sub_98 = new SubRule("req_uri", 63, 6, true, (IDCCoreVar)dcVars[9], false, "ln", null, 0, false);
	subContainer_27.addSubInstruction(sub_98);
		ISubRule sub_99 = new SubRule("req_hdr_Host_1", 32, 4, false, (IDCCoreVar)vars[1], false, "Host_342", null, 0, false);
	subContainer_27.addSubInstruction(sub_99);
		ISubRule sub_100 = new SubRule("req_hdr_Referer_1", 0, 72, false, (IDCCoreVar)dcVars[7], false, "Referer_171", null, 0, false);
	subContainer_27.addSubInstruction(sub_100);
		ISubRule sub_101 = new SubRule("req_hdr_Host_1", 0, 31, false, (IDCCoreVar)vars[0], false, "Host_341", null, 0, false);
	subContainer_27.addSubInstruction(sub_101);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E9440FC20E3557DFEAE23864643438"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E9440FC20E3557DFEAE23864643438"), 3);		
		IConnectionRecord serverConnection = ConnectionRecordFactory.find(parent, 
				parallelGroup, connConfigName,
				true, // close connection at test boundary,
				null, 0, 1); // error behavior
		reqAction.io2=serverConnection.getHttp2ioConnector();
		IHTTPRequest req = new HTTPRequest(
			"GET",	// method
			"https",  // protocol - http or https
			url, isURLRelative,
			"1.1",	// version
			headers,
			IHTTPSessionTypes.STANDARD,
			0, // delay
			isPrimary,
			null,// post data
			basicAuth,
			serverConnection,
			reqAction,
			"ISO-8859-1",
			"ISO-8859-1",
			"A1E9440FC211427CDFEAE23864643438",
			true,
			false
		);
		
		req.setExpectedResponseCode(304);
		req.setConnectionClose(connectionClose);
		

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("https//");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}

	public HTTPAction request_27(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1E9440FC2119080DFEAE23864643438", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(7);
					
		headers.add(new RequestHeaderData("Host", "rptsvt-win21.nonprod.hclpnp.com:9443", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (X11; Linux x86_64; rv:65.0) Gecko/20100101 Firefox/65.0", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("Accept", "image/webp,*/*", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.5", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("Referer", "https://rptsvt-win21.nonprod.hclpnp.com:9443/PlantsByWebSphere/promo.jsf", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "ISO-8859-1", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_28 = new DataSub();
	reqAction.addDataSub(subContainer_28);

		ISubRule sub_102 = new SubRule("req_uri", 68, 5, true, (IDCCoreVar)dcVars[13], false, "inventoryID", null, 0, false);
	subContainer_28.addSubInstruction(sub_102);
		ISubRule sub_103 = new SubRule("req_uri", 47, 8, true, (IDCCoreVar)dcVars[12], false, "action", null, 0, false);
	subContainer_28.addSubInstruction(sub_103);
		ISubRule sub_104 = new SubRule("req_hdr_Host_1", 32, 4, false, (IDCCoreVar)vars[1], false, "Host_340", null, 0, false);
	subContainer_28.addSubInstruction(sub_104);
		ISubRule sub_105 = new SubRule("req_hdr_Referer_1", 0, 72, false, (IDCCoreVar)dcVars[7], false, "Referer_170", null, 0, false);
	subContainer_28.addSubInstruction(sub_105);
		ISubRule sub_106 = new SubRule("req_hdr_Host_1", 0, 31, false, (IDCCoreVar)vars[0], false, "Host_339", null, 0, false);
	subContainer_28.addSubInstruction(sub_106);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E9440FC20E3557DFEAE23864643438"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E9440FC20E3557DFEAE23864643438"), 3);		
		IConnectionRecord serverConnection = ConnectionRecordFactory.find(parent, 
				parallelGroup, connConfigName,
				true, // close connection at test boundary,
				null, 0, 1); // error behavior
		reqAction.io2=serverConnection.getHttp2ioConnector();
		IHTTPRequest req = new HTTPRequest(
			"GET",	// method
			"https",  // protocol - http or https
			url, isURLRelative,
			"1.1",	// version
			headers,
			IHTTPSessionTypes.STANDARD,
			0, // delay
			isPrimary,
			null,// post data
			basicAuth,
			serverConnection,
			reqAction,
			"ISO-8859-1",
			"ISO-8859-1",
			"A1E9440FC2119083DFEAE23864643438",
			true,
			false
		);
		
		req.setExpectedResponseCode(200);
		req.setConnectionClose(connectionClose);
		

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("image/jpeg");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}

	public HTTPAction request_28(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1E9440FC2127AFFDFEAE23864643438", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(8);
					
		headers.add(new RequestHeaderData("Host", "rptsvt-win21.nonprod.hclpnp.com:9443", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (X11; Linux x86_64; rv:65.0) Gecko/20100101 Firefox/65.0", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("Accept", "image/webp,*/*", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.5", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("Referer", "https://rptsvt-win21.nonprod.hclpnp.com:9443/PlantsByWebSphere/promo.jsf", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("If-Modified-Since", "Mon, 16 Jan 2012 21:43:22 GMT", "ISO-8859-1", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_29 = new DataSub();
	reqAction.addDataSub(subContainer_29);

		ISubRule sub_107 = new SubRule("req_uri", 71, 6, true, (IDCCoreVar)dcVars[9], false, "ln", null, 0, false);
	subContainer_29.addSubInstruction(sub_107);
		ISubRule sub_108 = new SubRule("req_hdr_Host_1", 32, 4, false, (IDCCoreVar)vars[1], false, "Host_338", null, 0, false);
	subContainer_29.addSubInstruction(sub_108);
		ISubRule sub_109 = new SubRule("req_hdr_Referer_1", 0, 72, false, (IDCCoreVar)dcVars[7], false, "Referer_169", null, 0, false);
	subContainer_29.addSubInstruction(sub_109);
		ISubRule sub_110 = new SubRule("req_hdr_Host_1", 0, 31, false, (IDCCoreVar)vars[0], false, "Host_337", null, 0, false);
	subContainer_29.addSubInstruction(sub_110);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E9440FC20E3557DFEAE23864643438"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E9440FC20E3557DFEAE23864643438"), 3);		
		IConnectionRecord serverConnection = ConnectionRecordFactory.find(parent, 
				parallelGroup, connConfigName,
				true, // close connection at test boundary,
				null, 0, 1); // error behavior
		reqAction.io2=serverConnection.getHttp2ioConnector();
		IHTTPRequest req = new HTTPRequest(
			"GET",	// method
			"https",  // protocol - http or https
			url, isURLRelative,
			"1.1",	// version
			headers,
			IHTTPSessionTypes.STANDARD,
			0, // delay
			isPrimary,
			null,// post data
			basicAuth,
			serverConnection,
			reqAction,
			"ISO-8859-1",
			"ISO-8859-1",
			"A1E9440FC2127B02DFEAE23864643438",
			true,
			false
		);
		
		req.setExpectedResponseCode(304);
		req.setConnectionClose(connectionClose);
		

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("https//");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}

	public HTTPAction request_29(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1E9440FC212A23DDFEAE23864643438", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(7);
					
		headers.add(new RequestHeaderData("Host", "rptsvt-win21.nonprod.hclpnp.com:9443", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (X11; Linux x86_64; rv:65.0) Gecko/20100101 Firefox/65.0", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("Accept", "image/webp,*/*", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.5", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("Referer", "https://rptsvt-win21.nonprod.hclpnp.com:9443/PlantsByWebSphere/promo.jsf", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "ISO-8859-1", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_30 = new DataSub();
	reqAction.addDataSub(subContainer_30);

		ISubRule sub_111 = new SubRule("req_uri", 68, 5, true, (IDCCoreVar)dcVars[15], false, "inventoryID", null, 0, false);
	subContainer_30.addSubInstruction(sub_111);
		ISubRule sub_112 = new SubRule("req_uri", 47, 8, true, (IDCCoreVar)dcVars[12], false, "action", null, 0, false);
	subContainer_30.addSubInstruction(sub_112);
		ISubRule sub_113 = new SubRule("req_hdr_Host_1", 32, 4, false, (IDCCoreVar)vars[1], false, "Host_336", null, 0, false);
	subContainer_30.addSubInstruction(sub_113);
		ISubRule sub_114 = new SubRule("req_hdr_Referer_1", 0, 72, false, (IDCCoreVar)dcVars[7], false, "Referer_168", null, 0, false);
	subContainer_30.addSubInstruction(sub_114);
		ISubRule sub_115 = new SubRule("req_hdr_Host_1", 0, 31, false, (IDCCoreVar)vars[0], false, "Host_335", null, 0, false);
	subContainer_30.addSubInstruction(sub_115);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E9440FC20E3557DFEAE23864643438"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E9440FC20E3557DFEAE23864643438"), 3);		
		IConnectionRecord serverConnection = ConnectionRecordFactory.find(parent, 
				parallelGroup, connConfigName,
				true, // close connection at test boundary,
				null, 0, 1); // error behavior
		reqAction.io2=serverConnection.getHttp2ioConnector();
		IHTTPRequest req = new HTTPRequest(
			"GET",	// method
			"https",  // protocol - http or https
			url, isURLRelative,
			"1.1",	// version
			headers,
			IHTTPSessionTypes.STANDARD,
			0, // delay
			isPrimary,
			null,// post data
			basicAuth,
			serverConnection,
			reqAction,
			"ISO-8859-1",
			"ISO-8859-1",
			"A1E9440FC212A240DFEAE23864643438",
			true,
			false
		);
		
		req.setExpectedResponseCode(200);
		req.setConnectionClose(connectionClose);
		

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("image/jpeg");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}

	public HTTPAction request_30(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1E9440FC2142890DFEAE23864643438", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(7);
					
		headers.add(new RequestHeaderData("Host", "rptsvt-win21.nonprod.hclpnp.com:9443", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (X11; Linux x86_64; rv:65.0) Gecko/20100101 Firefox/65.0", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("Accept", "image/webp,*/*", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.5", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("Referer", "https://rptsvt-win21.nonprod.hclpnp.com:9443/PlantsByWebSphere/promo.jsf", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "ISO-8859-1", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_31 = new DataSub();
	reqAction.addDataSub(subContainer_31);

		ISubRule sub_116 = new SubRule("req_uri", 68, 5, true, (IDCCoreVar)dcVars[27], false, "inventoryID", null, 0, false);
	subContainer_31.addSubInstruction(sub_116);
		ISubRule sub_117 = new SubRule("req_uri", 47, 8, true, (IDCCoreVar)dcVars[12], false, "action", null, 0, false);
	subContainer_31.addSubInstruction(sub_117);
		ISubRule sub_118 = new SubRule("req_hdr_Host_1", 32, 4, false, (IDCCoreVar)vars[1], false, "Host_334", null, 0, false);
	subContainer_31.addSubInstruction(sub_118);
		ISubRule sub_119 = new SubRule("req_hdr_Referer_1", 0, 72, false, (IDCCoreVar)dcVars[7], false, "Referer_167", null, 0, false);
	subContainer_31.addSubInstruction(sub_119);
		ISubRule sub_120 = new SubRule("req_hdr_Host_1", 0, 31, false, (IDCCoreVar)vars[0], false, "Host_333", null, 0, false);
	subContainer_31.addSubInstruction(sub_120);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E9440FC20E3557DFEAE23864643438"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E9440FC20E3557DFEAE23864643438"), 3);		
		IConnectionRecord serverConnection = ConnectionRecordFactory.find(parent, 
				parallelGroup, connConfigName,
				true, // close connection at test boundary,
				null, 0, 1); // error behavior
		reqAction.io2=serverConnection.getHttp2ioConnector();
		IHTTPRequest req = new HTTPRequest(
			"GET",	// method
			"https",  // protocol - http or https
			url, isURLRelative,
			"1.1",	// version
			headers,
			IHTTPSessionTypes.STANDARD,
			0, // delay
			isPrimary,
			null,// post data
			basicAuth,
			serverConnection,
			reqAction,
			"ISO-8859-1",
			"ISO-8859-1",
			"A1E9440FC2142893DFEAE23864643438",
			true,
			false
		);
		
		req.setExpectedResponseCode(200);
		req.setConnectionClose(connectionClose);
		

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("image/jpeg");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}

	public HTTPAction request_31(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1E9440FC2156110DFEAE23864643438", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(7);
					
		headers.add(new RequestHeaderData("Host", "rptsvt-win21.nonprod.hclpnp.com:9443", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (X11; Linux x86_64; rv:65.0) Gecko/20100101 Firefox/65.0", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("Accept", "image/webp,*/*", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.5", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("Referer", "https://rptsvt-win21.nonprod.hclpnp.com:9443/PlantsByWebSphere/promo.jsf", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "ISO-8859-1", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_32 = new DataSub();
	reqAction.addDataSub(subContainer_32);

		ISubRule sub_121 = new SubRule("req_uri", 68, 5, true, (IDCCoreVar)dcVars[30], false, "inventoryID", null, 0, false);
	subContainer_32.addSubInstruction(sub_121);
		ISubRule sub_122 = new SubRule("req_uri", 47, 8, true, (IDCCoreVar)dcVars[12], false, "action", null, 0, false);
	subContainer_32.addSubInstruction(sub_122);
		ISubRule sub_123 = new SubRule("req_hdr_Host_1", 32, 4, false, (IDCCoreVar)vars[1], false, "Host_332", null, 0, false);
	subContainer_32.addSubInstruction(sub_123);
		ISubRule sub_124 = new SubRule("req_hdr_Referer_1", 0, 72, false, (IDCCoreVar)dcVars[7], false, "Referer_166", null, 0, false);
	subContainer_32.addSubInstruction(sub_124);
		ISubRule sub_125 = new SubRule("req_hdr_Host_1", 0, 31, false, (IDCCoreVar)vars[0], false, "Host_331", null, 0, false);
	subContainer_32.addSubInstruction(sub_125);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E9440FC20E3557DFEAE23864643438"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E9440FC20E3557DFEAE23864643438"), 3);		
		IConnectionRecord serverConnection = ConnectionRecordFactory.find(parent, 
				parallelGroup, connConfigName,
				true, // close connection at test boundary,
				null, 0, 1); // error behavior
		reqAction.io2=serverConnection.getHttp2ioConnector();
		IHTTPRequest req = new HTTPRequest(
			"GET",	// method
			"https",  // protocol - http or https
			url, isURLRelative,
			"1.1",	// version
			headers,
			IHTTPSessionTypes.STANDARD,
			0, // delay
			isPrimary,
			null,// post data
			basicAuth,
			serverConnection,
			reqAction,
			"ISO-8859-1",
			"ISO-8859-1",
			"A1E9440FC2156113DFEAE23864643438",
			true,
			false
		);
		
		req.setExpectedResponseCode(200);
		req.setConnectionClose(connectionClose);
		

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("image/jpeg");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}

	public HTTPAction request_32(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1E9440FC2169990DFEAE23864643438", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(7);
					
		headers.add(new RequestHeaderData("Host", "rptsvt-win21.nonprod.hclpnp.com:9443", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (X11; Linux x86_64; rv:65.0) Gecko/20100101 Firefox/65.0", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("Accept", "image/webp,*/*", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.5", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("Referer", "https://rptsvt-win21.nonprod.hclpnp.com:9443/PlantsByWebSphere/promo.jsf", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "ISO-8859-1", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_33 = new DataSub();
	reqAction.addDataSub(subContainer_33);

		ISubRule sub_126 = new SubRule("req_uri", 68, 5, true, (IDCCoreVar)dcVars[16], false, "inventoryID", null, 0, false);
	subContainer_33.addSubInstruction(sub_126);
		ISubRule sub_127 = new SubRule("req_uri", 47, 8, true, (IDCCoreVar)dcVars[12], false, "action", null, 0, false);
	subContainer_33.addSubInstruction(sub_127);
		ISubRule sub_128 = new SubRule("req_hdr_Host_1", 32, 4, false, (IDCCoreVar)vars[1], false, "Host_330", null, 0, false);
	subContainer_33.addSubInstruction(sub_128);
		ISubRule sub_129 = new SubRule("req_hdr_Referer_1", 0, 72, false, (IDCCoreVar)dcVars[7], false, "Referer_165", null, 0, false);
	subContainer_33.addSubInstruction(sub_129);
		ISubRule sub_130 = new SubRule("req_hdr_Host_1", 0, 31, false, (IDCCoreVar)vars[0], false, "Host_329", null, 0, false);
	subContainer_33.addSubInstruction(sub_130);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E9440FC20E3557DFEAE23864643438"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E9440FC20E3557DFEAE23864643438"), 3);		
		IConnectionRecord serverConnection = ConnectionRecordFactory.find(parent, 
				parallelGroup, connConfigName,
				true, // close connection at test boundary,
				null, 0, 1); // error behavior
		reqAction.io2=serverConnection.getHttp2ioConnector();
		IHTTPRequest req = new HTTPRequest(
			"GET",	// method
			"https",  // protocol - http or https
			url, isURLRelative,
			"1.1",	// version
			headers,
			IHTTPSessionTypes.STANDARD,
			0, // delay
			isPrimary,
			null,// post data
			basicAuth,
			serverConnection,
			reqAction,
			"ISO-8859-1",
			"ISO-8859-1",
			"A1E9440FC2169993DFEAE23864643438",
			true,
			false
		);
		
		req.setExpectedResponseCode(200);
		req.setConnectionClose(connectionClose);
		

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("image/jpeg");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}

	public HTTPAction request_33(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1E9440FC216E7CDDFEAE23864643438", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(7);
					
		headers.add(new RequestHeaderData("Host", "rptsvt-win21.nonprod.hclpnp.com:9443", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (X11; Linux x86_64; rv:65.0) Gecko/20100101 Firefox/65.0", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("Accept", "image/webp,*/*", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.5", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("Referer", "https://rptsvt-win21.nonprod.hclpnp.com:9443/PlantsByWebSphere/promo.jsf", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "ISO-8859-1", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_34 = new DataSub();
	reqAction.addDataSub(subContainer_34);

		ISubRule sub_131 = new SubRule("req_uri", 68, 5, true, (IDCCoreVar)dcVars[14], false, "inventoryID", null, 0, false);
	subContainer_34.addSubInstruction(sub_131);
		ISubRule sub_132 = new SubRule("req_uri", 47, 8, true, (IDCCoreVar)dcVars[12], false, "action", null, 0, false);
	subContainer_34.addSubInstruction(sub_132);
		ISubRule sub_133 = new SubRule("req_hdr_Host_1", 32, 4, false, (IDCCoreVar)vars[1], false, "Host_328", null, 0, false);
	subContainer_34.addSubInstruction(sub_133);
		ISubRule sub_134 = new SubRule("req_hdr_Referer_1", 0, 72, false, (IDCCoreVar)dcVars[7], false, "Referer_164", null, 0, false);
	subContainer_34.addSubInstruction(sub_134);
		ISubRule sub_135 = new SubRule("req_hdr_Host_1", 0, 31, false, (IDCCoreVar)vars[0], false, "Host_327", null, 0, false);
	subContainer_34.addSubInstruction(sub_135);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E9440FC20E3557DFEAE23864643438"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E9440FC20E3557DFEAE23864643438"), 3);		
		IConnectionRecord serverConnection = ConnectionRecordFactory.find(parent, 
				parallelGroup, connConfigName,
				true, // close connection at test boundary,
				null, 0, 1); // error behavior
		reqAction.io2=serverConnection.getHttp2ioConnector();
		IHTTPRequest req = new HTTPRequest(
			"GET",	// method
			"https",  // protocol - http or https
			url, isURLRelative,
			"1.1",	// version
			headers,
			IHTTPSessionTypes.STANDARD,
			0, // delay
			isPrimary,
			null,// post data
			basicAuth,
			serverConnection,
			reqAction,
			"ISO-8859-1",
			"ISO-8859-1",
			"A1E9440FC216E7D0DFEAE23864643438",
			true,
			false
		);
		
		req.setExpectedResponseCode(200);
		req.setConnectionClose(connectionClose);
		

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("image/jpeg");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}

	public HTTPAction request_34(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1E9440FC21735EBDFEAE23864643438", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(7);
					
		headers.add(new RequestHeaderData("Host", "rptsvt-win21.nonprod.hclpnp.com:9443", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (X11; Linux x86_64; rv:65.0) Gecko/20100101 Firefox/65.0", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("Accept", "image/webp,*/*", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.5", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("Referer", "https://rptsvt-win21.nonprod.hclpnp.com:9443/PlantsByWebSphere/promo.jsf", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "ISO-8859-1", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_35 = new DataSub();
	reqAction.addDataSub(subContainer_35);

		ISubRule sub_136 = new SubRule("req_uri", 68, 5, true, (IDCCoreVar)dcVars[17], false, "inventoryID", null, 0, false);
	subContainer_35.addSubInstruction(sub_136);
		ISubRule sub_137 = new SubRule("req_uri", 47, 8, true, (IDCCoreVar)dcVars[12], false, "action", null, 0, false);
	subContainer_35.addSubInstruction(sub_137);
		ISubRule sub_138 = new SubRule("req_hdr_Host_1", 32, 4, false, (IDCCoreVar)vars[1], false, "Host_326", null, 0, false);
	subContainer_35.addSubInstruction(sub_138);
		ISubRule sub_139 = new SubRule("req_hdr_Referer_1", 0, 72, false, (IDCCoreVar)dcVars[7], false, "Referer_163", null, 0, false);
	subContainer_35.addSubInstruction(sub_139);
		ISubRule sub_140 = new SubRule("req_hdr_Host_1", 0, 31, false, (IDCCoreVar)vars[0], false, "Host_325", null, 0, false);
	subContainer_35.addSubInstruction(sub_140);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E9440FC20E3557DFEAE23864643438"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E9440FC20E3557DFEAE23864643438"), 3);		
		IConnectionRecord serverConnection = ConnectionRecordFactory.find(parent, 
				parallelGroup, connConfigName,
				true, // close connection at test boundary,
				null, 0, 1); // error behavior
		reqAction.io2=serverConnection.getHttp2ioConnector();
		IHTTPRequest req = new HTTPRequest(
			"GET",	// method
			"https",  // protocol - http or https
			url, isURLRelative,
			"1.1",	// version
			headers,
			IHTTPSessionTypes.STANDARD,
			0, // delay
			isPrimary,
			null,// post data
			basicAuth,
			serverConnection,
			reqAction,
			"ISO-8859-1",
			"ISO-8859-1",
			"A1E9440FC21735EEDFEAE23864643438",
			true,
			false
		);
		
		req.setExpectedResponseCode(200);
		req.setConnectionClose(connectionClose);
		

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("image/jpeg");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}

	public HTTPAction request_35(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1E9440FC217AB00DFEAE23864643438", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(7);
					
		headers.add(new RequestHeaderData("Host", "rptsvt-win21.nonprod.hclpnp.com:9443", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (X11; Linux x86_64; rv:65.0) Gecko/20100101 Firefox/65.0", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("Accept", "image/webp,*/*", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.5", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("Referer", "https://rptsvt-win21.nonprod.hclpnp.com:9443/PlantsByWebSphere/promo.jsf", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "ISO-8859-1", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_36 = new DataSub();
	reqAction.addDataSub(subContainer_36);

		ISubRule sub_141 = new SubRule("req_uri", 68, 5, true, (IDCCoreVar)dcVars[18], false, "inventoryID", null, 0, false);
	subContainer_36.addSubInstruction(sub_141);
		ISubRule sub_142 = new SubRule("req_uri", 47, 8, true, (IDCCoreVar)dcVars[12], false, "action", null, 0, false);
	subContainer_36.addSubInstruction(sub_142);
		ISubRule sub_143 = new SubRule("req_hdr_Host_1", 32, 4, false, (IDCCoreVar)vars[1], false, "Host_324", null, 0, false);
	subContainer_36.addSubInstruction(sub_143);
		ISubRule sub_144 = new SubRule("req_hdr_Referer_1", 0, 72, false, (IDCCoreVar)dcVars[7], false, "Referer_162", null, 0, false);
	subContainer_36.addSubInstruction(sub_144);
		ISubRule sub_145 = new SubRule("req_hdr_Host_1", 0, 31, false, (IDCCoreVar)vars[0], false, "Host_323", null, 0, false);
	subContainer_36.addSubInstruction(sub_145);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E9440FC20E3557DFEAE23864643438"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E9440FC20E3557DFEAE23864643438"), 3);		
		IConnectionRecord serverConnection = ConnectionRecordFactory.find(parent, 
				parallelGroup, connConfigName,
				true, // close connection at test boundary,
				null, 0, 1); // error behavior
		reqAction.io2=serverConnection.getHttp2ioConnector();
		IHTTPRequest req = new HTTPRequest(
			"GET",	// method
			"https",  // protocol - http or https
			url, isURLRelative,
			"1.1",	// version
			headers,
			IHTTPSessionTypes.STANDARD,
			0, // delay
			isPrimary,
			null,// post data
			basicAuth,
			serverConnection,
			reqAction,
			"ISO-8859-1",
			"ISO-8859-1",
			"A1E9440FC217AB03DFEAE23864643438",
			true,
			false
		);
		
		req.setExpectedResponseCode(200);
		req.setConnectionClose(connectionClose);
		

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("image/jpeg");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}

	public HTTPAction request_36(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1E9440FC2184740DFEAE23864643438", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(7);
					
		headers.add(new RequestHeaderData("Host", "rptsvt-win21.nonprod.hclpnp.com:9443", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (X11; Linux x86_64; rv:65.0) Gecko/20100101 Firefox/65.0", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("Accept", "image/webp,*/*", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.5", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("Referer", "https://rptsvt-win21.nonprod.hclpnp.com:9443/PlantsByWebSphere/promo.jsf", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "ISO-8859-1", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_37 = new DataSub();
	reqAction.addDataSub(subContainer_37);

		ISubRule sub_146 = new SubRule("req_uri", 68, 5, true, (IDCCoreVar)dcVars[20], false, "inventoryID", null, 0, false);
	subContainer_37.addSubInstruction(sub_146);
		ISubRule sub_147 = new SubRule("req_uri", 47, 8, true, (IDCCoreVar)dcVars[12], false, "action", null, 0, false);
	subContainer_37.addSubInstruction(sub_147);
		ISubRule sub_148 = new SubRule("req_hdr_Host_1", 32, 4, false, (IDCCoreVar)vars[1], false, "Host_322", null, 0, false);
	subContainer_37.addSubInstruction(sub_148);
		ISubRule sub_149 = new SubRule("req_hdr_Referer_1", 0, 72, false, (IDCCoreVar)dcVars[7], false, "Referer_161", null, 0, false);
	subContainer_37.addSubInstruction(sub_149);
		ISubRule sub_150 = new SubRule("req_hdr_Host_1", 0, 31, false, (IDCCoreVar)vars[0], false, "Host_321", null, 0, false);
	subContainer_37.addSubInstruction(sub_150);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E9440FC20E3557DFEAE23864643438"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E9440FC20E3557DFEAE23864643438"), 3);		
		IConnectionRecord serverConnection = ConnectionRecordFactory.find(parent, 
				parallelGroup, connConfigName,
				true, // close connection at test boundary,
				null, 0, 1); // error behavior
		reqAction.io2=serverConnection.getHttp2ioConnector();
		IHTTPRequest req = new HTTPRequest(
			"GET",	// method
			"https",  // protocol - http or https
			url, isURLRelative,
			"1.1",	// version
			headers,
			IHTTPSessionTypes.STANDARD,
			0, // delay
			isPrimary,
			null,// post data
			basicAuth,
			serverConnection,
			reqAction,
			"ISO-8859-1",
			"ISO-8859-1",
			"A1E9440FC2184743DFEAE23864643438",
			true,
			false
		);
		
		req.setExpectedResponseCode(200);
		req.setConnectionClose(connectionClose);
		

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("image/jpeg");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}

	public HTTPAction request_37(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1E9440FC218BC70DFEAE23864643438", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(7);
					
		headers.add(new RequestHeaderData("Host", "rptsvt-win21.nonprod.hclpnp.com:9443", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (X11; Linux x86_64; rv:65.0) Gecko/20100101 Firefox/65.0", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("Accept", "image/webp,*/*", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.5", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("Referer", "https://rptsvt-win21.nonprod.hclpnp.com:9443/PlantsByWebSphere/promo.jsf", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "ISO-8859-1", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_38 = new DataSub();
	reqAction.addDataSub(subContainer_38);

		ISubRule sub_151 = new SubRule("req_uri", 68, 5, true, (IDCCoreVar)dcVars[19], false, "inventoryID", null, 0, false);
	subContainer_38.addSubInstruction(sub_151);
		ISubRule sub_152 = new SubRule("req_uri", 47, 8, true, (IDCCoreVar)dcVars[12], false, "action", null, 0, false);
	subContainer_38.addSubInstruction(sub_152);
		ISubRule sub_153 = new SubRule("req_hdr_Host_1", 32, 4, false, (IDCCoreVar)vars[1], false, "Host_320", null, 0, false);
	subContainer_38.addSubInstruction(sub_153);
		ISubRule sub_154 = new SubRule("req_hdr_Referer_1", 0, 72, false, (IDCCoreVar)dcVars[7], false, "Referer_160", null, 0, false);
	subContainer_38.addSubInstruction(sub_154);
		ISubRule sub_155 = new SubRule("req_hdr_Host_1", 0, 31, false, (IDCCoreVar)vars[0], false, "Host_319", null, 0, false);
	subContainer_38.addSubInstruction(sub_155);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E9440FC20E3557DFEAE23864643438"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E9440FC20E3557DFEAE23864643438"), 3);		
		IConnectionRecord serverConnection = ConnectionRecordFactory.find(parent, 
				parallelGroup, connConfigName,
				true, // close connection at test boundary,
				null, 0, 1); // error behavior
		reqAction.io2=serverConnection.getHttp2ioConnector();
		IHTTPRequest req = new HTTPRequest(
			"GET",	// method
			"https",  // protocol - http or https
			url, isURLRelative,
			"1.1",	// version
			headers,
			IHTTPSessionTypes.STANDARD,
			0, // delay
			isPrimary,
			null,// post data
			basicAuth,
			serverConnection,
			reqAction,
			"ISO-8859-1",
			"ISO-8859-1",
			"A1E9440FC218E380DFEAE23864643438",
			true,
			false
		);
		
		req.setExpectedResponseCode(200);
		req.setConnectionClose(connectionClose);
		

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("image/jpeg");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}

	public HTTPAction request_38(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1E9440FC2190AAFDFEAE23864643438", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(7);
					
		headers.add(new RequestHeaderData("Host", "rptsvt-win21.nonprod.hclpnp.com:9443", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (X11; Linux x86_64; rv:65.0) Gecko/20100101 Firefox/65.0", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("Accept", "image/webp,*/*", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.5", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("Referer", "https://rptsvt-win21.nonprod.hclpnp.com:9443/PlantsByWebSphere/promo.jsf", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "ISO-8859-1", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_39 = new DataSub();
	reqAction.addDataSub(subContainer_39);

		ISubRule sub_156 = new SubRule("req_uri", 68, 5, true, (IDCCoreVar)dcVars[21], false, "inventoryID", null, 0, false);
	subContainer_39.addSubInstruction(sub_156);
		ISubRule sub_157 = new SubRule("req_uri", 47, 8, true, (IDCCoreVar)dcVars[12], false, "action", null, 0, false);
	subContainer_39.addSubInstruction(sub_157);
		ISubRule sub_158 = new SubRule("req_hdr_Host_1", 32, 4, false, (IDCCoreVar)vars[1], false, "Host_318", null, 0, false);
	subContainer_39.addSubInstruction(sub_158);
		ISubRule sub_159 = new SubRule("req_hdr_Referer_1", 0, 72, false, (IDCCoreVar)dcVars[7], false, "Referer_159", null, 0, false);
	subContainer_39.addSubInstruction(sub_159);
		ISubRule sub_160 = new SubRule("req_hdr_Host_1", 0, 31, false, (IDCCoreVar)vars[0], false, "Host_317", null, 0, false);
	subContainer_39.addSubInstruction(sub_160);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E9440FC20E3557DFEAE23864643438"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E9440FC20E3557DFEAE23864643438"), 3);		
		IConnectionRecord serverConnection = ConnectionRecordFactory.find(parent, 
				parallelGroup, connConfigName,
				true, // close connection at test boundary,
				null, 0, 1); // error behavior
		reqAction.io2=serverConnection.getHttp2ioConnector();
		IHTTPRequest req = new HTTPRequest(
			"GET",	// method
			"https",  // protocol - http or https
			url, isURLRelative,
			"1.1",	// version
			headers,
			IHTTPSessionTypes.STANDARD,
			0, // delay
			isPrimary,
			null,// post data
			basicAuth,
			serverConnection,
			reqAction,
			"ISO-8859-1",
			"ISO-8859-1",
			"A1E9440FC2190AB2DFEAE23864643438",
			true,
			false
		);
		
		req.setExpectedResponseCode(200);
		req.setConnectionClose(connectionClose);
		

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("image/jpeg");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}

	public HTTPAction request_39(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1E9440FC21BA2A0DFEAE23864643438", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(7);
					
		headers.add(new RequestHeaderData("Host", "rptsvt-win21.nonprod.hclpnp.com:9443", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (X11; Linux x86_64; rv:65.0) Gecko/20100101 Firefox/65.0", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("Accept", "image/webp,*/*", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.5", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("Referer", "https://rptsvt-win21.nonprod.hclpnp.com:9443/PlantsByWebSphere/promo.jsf", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "ISO-8859-1", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_40 = new DataSub();
	reqAction.addDataSub(subContainer_40);

		ISubRule sub_161 = new SubRule("req_uri", 68, 5, true, (IDCCoreVar)dcVars[22], false, "inventoryID", null, 0, false);
	subContainer_40.addSubInstruction(sub_161);
		ISubRule sub_162 = new SubRule("req_uri", 47, 8, true, (IDCCoreVar)dcVars[12], false, "action", null, 0, false);
	subContainer_40.addSubInstruction(sub_162);
		ISubRule sub_163 = new SubRule("req_hdr_Host_1", 32, 4, false, (IDCCoreVar)vars[1], false, "Host_316", null, 0, false);
	subContainer_40.addSubInstruction(sub_163);
		ISubRule sub_164 = new SubRule("req_hdr_Referer_1", 0, 72, false, (IDCCoreVar)dcVars[7], false, "Referer_158", null, 0, false);
	subContainer_40.addSubInstruction(sub_164);
		ISubRule sub_165 = new SubRule("req_hdr_Host_1", 0, 31, false, (IDCCoreVar)vars[0], false, "Host_315", null, 0, false);
	subContainer_40.addSubInstruction(sub_165);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E9440FC20E3557DFEAE23864643438"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E9440FC20E3557DFEAE23864643438"), 3);		
		IConnectionRecord serverConnection = ConnectionRecordFactory.find(parent, 
				parallelGroup, connConfigName,
				true, // close connection at test boundary,
				null, 0, 1); // error behavior
		reqAction.io2=serverConnection.getHttp2ioConnector();
		IHTTPRequest req = new HTTPRequest(
			"GET",	// method
			"https",  // protocol - http or https
			url, isURLRelative,
			"1.1",	// version
			headers,
			IHTTPSessionTypes.STANDARD,
			0, // delay
			isPrimary,
			null,// post data
			basicAuth,
			serverConnection,
			reqAction,
			"ISO-8859-1",
			"ISO-8859-1",
			"A1E9440FC21BA2A3DFEAE23864643438",
			true,
			false
		);
		
		req.setExpectedResponseCode(200);
		req.setConnectionClose(connectionClose);
		

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("image/jpeg");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}

	public HTTPAction request_40(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1E9440FC21DC59BDFEAE23864643438", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(7);
					
		headers.add(new RequestHeaderData("Host", "rptsvt-win21.nonprod.hclpnp.com:9443", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (X11; Linux x86_64; rv:65.0) Gecko/20100101 Firefox/65.0", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("Accept", "image/webp,*/*", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.5", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("Referer", "https://rptsvt-win21.nonprod.hclpnp.com:9443/PlantsByWebSphere/promo.jsf", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "ISO-8859-1", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_41 = new DataSub();
	reqAction.addDataSub(subContainer_41);

		ISubRule sub_166 = new SubRule("req_uri", 68, 5, true, (IDCCoreVar)dcVars[23], false, "inventoryID", null, 0, false);
	subContainer_41.addSubInstruction(sub_166);
		ISubRule sub_167 = new SubRule("req_uri", 47, 8, true, (IDCCoreVar)dcVars[12], false, "action", null, 0, false);
	subContainer_41.addSubInstruction(sub_167);
		ISubRule sub_168 = new SubRule("req_hdr_Host_1", 32, 4, false, (IDCCoreVar)vars[1], false, "Host_314", null, 0, false);
	subContainer_41.addSubInstruction(sub_168);
		ISubRule sub_169 = new SubRule("req_hdr_Referer_1", 0, 72, false, (IDCCoreVar)dcVars[7], false, "Referer_157", null, 0, false);
	subContainer_41.addSubInstruction(sub_169);
		ISubRule sub_170 = new SubRule("req_hdr_Host_1", 0, 31, false, (IDCCoreVar)vars[0], false, "Host_313", null, 0, false);
	subContainer_41.addSubInstruction(sub_170);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E9440FC20E3557DFEAE23864643438"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E9440FC20E3557DFEAE23864643438"), 3);		
		IConnectionRecord serverConnection = ConnectionRecordFactory.find(parent, 
				parallelGroup, connConfigName,
				true, // close connection at test boundary,
				null, 0, 1); // error behavior
		reqAction.io2=serverConnection.getHttp2ioConnector();
		IHTTPRequest req = new HTTPRequest(
			"GET",	// method
			"https",  // protocol - http or https
			url, isURLRelative,
			"1.1",	// version
			headers,
			IHTTPSessionTypes.STANDARD,
			0, // delay
			isPrimary,
			null,// post data
			basicAuth,
			serverConnection,
			reqAction,
			"ISO-8859-1",
			"ISO-8859-1",
			"A1E9440FC21DC59EDFEAE23864643438",
			true,
			false
		);
		
		req.setExpectedResponseCode(200);
		req.setConnectionClose(connectionClose);
		

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("image/jpeg");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}

	public HTTPAction request_41(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1E9440FC21E13BFDFEAE23864643438", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(7);
					
		headers.add(new RequestHeaderData("Host", "rptsvt-win21.nonprod.hclpnp.com:9443", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (X11; Linux x86_64; rv:65.0) Gecko/20100101 Firefox/65.0", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("Accept", "image/webp,*/*", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.5", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("Referer", "https://rptsvt-win21.nonprod.hclpnp.com:9443/PlantsByWebSphere/promo.jsf", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "ISO-8859-1", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_42 = new DataSub();
	reqAction.addDataSub(subContainer_42);

		ISubRule sub_171 = new SubRule("req_uri", 68, 5, true, (IDCCoreVar)dcVars[24], false, "inventoryID", null, 0, false);
	subContainer_42.addSubInstruction(sub_171);
		ISubRule sub_172 = new SubRule("req_uri", 47, 8, true, (IDCCoreVar)dcVars[12], false, "action", null, 0, false);
	subContainer_42.addSubInstruction(sub_172);
		ISubRule sub_173 = new SubRule("req_hdr_Host_1", 32, 4, false, (IDCCoreVar)vars[1], false, "Host_312", null, 0, false);
	subContainer_42.addSubInstruction(sub_173);
		ISubRule sub_174 = new SubRule("req_hdr_Referer_1", 0, 72, false, (IDCCoreVar)dcVars[7], false, "Referer_156", null, 0, false);
	subContainer_42.addSubInstruction(sub_174);
		ISubRule sub_175 = new SubRule("req_hdr_Host_1", 0, 31, false, (IDCCoreVar)vars[0], false, "Host_311", null, 0, false);
	subContainer_42.addSubInstruction(sub_175);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E9440FC20E3557DFEAE23864643438"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E9440FC20E3557DFEAE23864643438"), 3);		
		IConnectionRecord serverConnection = ConnectionRecordFactory.find(parent, 
				parallelGroup, connConfigName,
				true, // close connection at test boundary,
				null, 0, 1); // error behavior
		reqAction.io2=serverConnection.getHttp2ioConnector();
		IHTTPRequest req = new HTTPRequest(
			"GET",	// method
			"https",  // protocol - http or https
			url, isURLRelative,
			"1.1",	// version
			headers,
			IHTTPSessionTypes.STANDARD,
			0, // delay
			isPrimary,
			null,// post data
			basicAuth,
			serverConnection,
			reqAction,
			"ISO-8859-1",
			"ISO-8859-1",
			"A1E9440FC21E13C2DFEAE23864643438",
			true,
			false
		);
		
		req.setExpectedResponseCode(200);
		req.setConnectionClose(connectionClose);
		

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("image/jpeg");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}

	public HTTPAction request_42(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1E9440FC21E88EFDFEAE23864643438", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(7);
					
		headers.add(new RequestHeaderData("Host", "rptsvt-win21.nonprod.hclpnp.com:9443", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (X11; Linux x86_64; rv:65.0) Gecko/20100101 Firefox/65.0", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("Accept", "image/webp,*/*", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.5", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("Referer", "https://rptsvt-win21.nonprod.hclpnp.com:9443/PlantsByWebSphere/promo.jsf", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "ISO-8859-1", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_43 = new DataSub();
	reqAction.addDataSub(subContainer_43);

		ISubRule sub_176 = new SubRule("req_uri", 68, 5, true, (IDCCoreVar)dcVars[25], false, "inventoryID", null, 0, false);
	subContainer_43.addSubInstruction(sub_176);
		ISubRule sub_177 = new SubRule("req_uri", 47, 8, true, (IDCCoreVar)dcVars[12], false, "action", null, 0, false);
	subContainer_43.addSubInstruction(sub_177);
		ISubRule sub_178 = new SubRule("req_hdr_Host_1", 32, 4, false, (IDCCoreVar)vars[1], false, "Host_310", null, 0, false);
	subContainer_43.addSubInstruction(sub_178);
		ISubRule sub_179 = new SubRule("req_hdr_Referer_1", 0, 72, false, (IDCCoreVar)dcVars[7], false, "Referer_155", null, 0, false);
	subContainer_43.addSubInstruction(sub_179);
		ISubRule sub_180 = new SubRule("req_hdr_Host_1", 0, 31, false, (IDCCoreVar)vars[0], false, "Host_309", null, 0, false);
	subContainer_43.addSubInstruction(sub_180);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E9440FC20E3557DFEAE23864643438"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E9440FC20E3557DFEAE23864643438"), 3);		
		IConnectionRecord serverConnection = ConnectionRecordFactory.find(parent, 
				parallelGroup, connConfigName,
				true, // close connection at test boundary,
				null, 0, 1); // error behavior
		reqAction.io2=serverConnection.getHttp2ioConnector();
		IHTTPRequest req = new HTTPRequest(
			"GET",	// method
			"https",  // protocol - http or https
			url, isURLRelative,
			"1.1",	// version
			headers,
			IHTTPSessionTypes.STANDARD,
			0, // delay
			isPrimary,
			null,// post data
			basicAuth,
			serverConnection,
			reqAction,
			"ISO-8859-1",
			"ISO-8859-1",
			"A1E9440FC21E88F2DFEAE23864643438",
			true,
			false
		);
		
		req.setExpectedResponseCode(200);
		req.setConnectionClose(connectionClose);
		

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("image/jpeg");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}

	public HTTPAction request_43(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1E9440FC21ED6FBDFEAE23864643438", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(7);
					
		headers.add(new RequestHeaderData("Host", "rptsvt-win21.nonprod.hclpnp.com:9443", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (X11; Linux x86_64; rv:65.0) Gecko/20100101 Firefox/65.0", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("Accept", "image/webp,*/*", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.5", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("Referer", "https://rptsvt-win21.nonprod.hclpnp.com:9443/PlantsByWebSphere/promo.jsf", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "ISO-8859-1", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_44 = new DataSub();
	reqAction.addDataSub(subContainer_44);

		ISubRule sub_181 = new SubRule("req_uri", 68, 5, true, (IDCCoreVar)dcVars[26], false, "inventoryID", null, 0, false);
	subContainer_44.addSubInstruction(sub_181);
		ISubRule sub_182 = new SubRule("req_uri", 47, 8, true, (IDCCoreVar)dcVars[12], false, "action", null, 0, false);
	subContainer_44.addSubInstruction(sub_182);
		ISubRule sub_183 = new SubRule("req_hdr_Host_1", 32, 4, false, (IDCCoreVar)vars[1], false, "Host_308", null, 0, false);
	subContainer_44.addSubInstruction(sub_183);
		ISubRule sub_184 = new SubRule("req_hdr_Referer_1", 0, 72, false, (IDCCoreVar)dcVars[7], false, "Referer_154", null, 0, false);
	subContainer_44.addSubInstruction(sub_184);
		ISubRule sub_185 = new SubRule("req_hdr_Host_1", 0, 31, false, (IDCCoreVar)vars[0], false, "Host_307", null, 0, false);
	subContainer_44.addSubInstruction(sub_185);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E9440FC20E3557DFEAE23864643438"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E9440FC20E3557DFEAE23864643438"), 3);		
		IConnectionRecord serverConnection = ConnectionRecordFactory.find(parent, 
				parallelGroup, connConfigName,
				true, // close connection at test boundary,
				null, 0, 1); // error behavior
		reqAction.io2=serverConnection.getHttp2ioConnector();
		IHTTPRequest req = new HTTPRequest(
			"GET",	// method
			"https",  // protocol - http or https
			url, isURLRelative,
			"1.1",	// version
			headers,
			IHTTPSessionTypes.STANDARD,
			0, // delay
			isPrimary,
			null,// post data
			basicAuth,
			serverConnection,
			reqAction,
			"ISO-8859-1",
			"ISO-8859-1",
			"A1E9440FC21ED6FEDFEAE23864643438",
			true,
			false
		);
		
		req.setExpectedResponseCode(200);
		req.setConnectionClose(connectionClose);
		

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("image/jpeg");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}

	public HTTPAction request_44(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1E9440FC2205D90DFEAE23864643438", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(7);
					
		headers.add(new RequestHeaderData("Host", "rptsvt-win21.nonprod.hclpnp.com:9443", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (X11; Linux x86_64; rv:65.0) Gecko/20100101 Firefox/65.0", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("Accept", "image/webp,*/*", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.5", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("Referer", "https://rptsvt-win21.nonprod.hclpnp.com:9443/PlantsByWebSphere/promo.jsf", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "ISO-8859-1", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_45 = new DataSub();
	reqAction.addDataSub(subContainer_45);

		ISubRule sub_186 = new SubRule("req_uri", 68, 5, true, (IDCCoreVar)dcVars[28], false, "inventoryID", null, 0, false);
	subContainer_45.addSubInstruction(sub_186);
		ISubRule sub_187 = new SubRule("req_uri", 47, 8, true, (IDCCoreVar)dcVars[12], false, "action", null, 0, false);
	subContainer_45.addSubInstruction(sub_187);
		ISubRule sub_188 = new SubRule("req_hdr_Host_1", 32, 4, false, (IDCCoreVar)vars[1], false, "Host_306", null, 0, false);
	subContainer_45.addSubInstruction(sub_188);
		ISubRule sub_189 = new SubRule("req_hdr_Referer_1", 0, 72, false, (IDCCoreVar)dcVars[7], false, "Referer_153", null, 0, false);
	subContainer_45.addSubInstruction(sub_189);
		ISubRule sub_190 = new SubRule("req_hdr_Host_1", 0, 31, false, (IDCCoreVar)vars[0], false, "Host_305", null, 0, false);
	subContainer_45.addSubInstruction(sub_190);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E9440FC20E3557DFEAE23864643438"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E9440FC20E3557DFEAE23864643438"), 3);		
		IConnectionRecord serverConnection = ConnectionRecordFactory.find(parent, 
				parallelGroup, connConfigName,
				true, // close connection at test boundary,
				null, 0, 1); // error behavior
		reqAction.io2=serverConnection.getHttp2ioConnector();
		IHTTPRequest req = new HTTPRequest(
			"GET",	// method
			"https",  // protocol - http or https
			url, isURLRelative,
			"1.1",	// version
			headers,
			IHTTPSessionTypes.STANDARD,
			0, // delay
			isPrimary,
			null,// post data
			basicAuth,
			serverConnection,
			reqAction,
			"ISO-8859-1",
			"ISO-8859-1",
			"A1E9440FC2205D93DFEAE23864643438",
			true,
			false
		);
		
		req.setExpectedResponseCode(200);
		req.setConnectionClose(connectionClose);
		

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("image/jpeg");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}

	public HTTPAction request_45(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1E9440FC220ABCFDFEAE23864643438", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(7);
					
		headers.add(new RequestHeaderData("Host", "rptsvt-win21.nonprod.hclpnp.com:9443", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (X11; Linux x86_64; rv:65.0) Gecko/20100101 Firefox/65.0", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("Accept", "image/webp,*/*", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.5", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("Referer", "https://rptsvt-win21.nonprod.hclpnp.com:9443/PlantsByWebSphere/promo.jsf", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "ISO-8859-1", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_46 = new DataSub();
	reqAction.addDataSub(subContainer_46);

		ISubRule sub_191 = new SubRule("req_uri", 68, 5, true, (IDCCoreVar)dcVars[29], false, "inventoryID", null, 0, false);
	subContainer_46.addSubInstruction(sub_191);
		ISubRule sub_192 = new SubRule("req_uri", 47, 8, true, (IDCCoreVar)dcVars[12], false, "action", null, 0, false);
	subContainer_46.addSubInstruction(sub_192);
		ISubRule sub_193 = new SubRule("req_hdr_Host_1", 32, 4, false, (IDCCoreVar)vars[1], false, "Host_304", null, 0, false);
	subContainer_46.addSubInstruction(sub_193);
		ISubRule sub_194 = new SubRule("req_hdr_Referer_1", 0, 72, false, (IDCCoreVar)dcVars[7], false, "Referer_152", null, 0, false);
	subContainer_46.addSubInstruction(sub_194);
		ISubRule sub_195 = new SubRule("req_hdr_Host_1", 0, 31, false, (IDCCoreVar)vars[0], false, "Host_303", null, 0, false);
	subContainer_46.addSubInstruction(sub_195);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E9440FC20E3557DFEAE23864643438"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E9440FC20E3557DFEAE23864643438"), 3);		
		IConnectionRecord serverConnection = ConnectionRecordFactory.find(parent, 
				parallelGroup, connConfigName,
				true, // close connection at test boundary,
				null, 0, 1); // error behavior
		reqAction.io2=serverConnection.getHttp2ioConnector();
		IHTTPRequest req = new HTTPRequest(
			"GET",	// method
			"https",  // protocol - http or https
			url, isURLRelative,
			"1.1",	// version
			headers,
			IHTTPSessionTypes.STANDARD,
			0, // delay
			isPrimary,
			null,// post data
			basicAuth,
			serverConnection,
			reqAction,
			"ISO-8859-1",
			"ISO-8859-1",
			"A1E9440FC220ABD2DFEAE23864643438",
			true,
			false
		);
		
		req.setExpectedResponseCode(200);
		req.setConnectionClose(connectionClose);
		

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("image/jpeg");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}

	public HTTPAction request_46(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1E9440FC2216F00DFEAE23864643438", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(7);
					
		headers.add(new RequestHeaderData("Host", "rptsvt-win21.nonprod.hclpnp.com:9443", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (X11; Linux x86_64; rv:65.0) Gecko/20100101 Firefox/65.0", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("Accept", "image/webp,*/*", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.5", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("Referer", "https://rptsvt-win21.nonprod.hclpnp.com:9443/PlantsByWebSphere/promo.jsf", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "ISO-8859-1", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_47 = new DataSub();
	reqAction.addDataSub(subContainer_47);

		ISubRule sub_196 = new SubRule("req_uri", 68, 5, true, (IDCCoreVar)dcVars[31], false, "inventoryID", null, 0, false);
	subContainer_47.addSubInstruction(sub_196);
		ISubRule sub_197 = new SubRule("req_uri", 47, 8, true, (IDCCoreVar)dcVars[12], false, "action", null, 0, false);
	subContainer_47.addSubInstruction(sub_197);
		ISubRule sub_198 = new SubRule("req_hdr_Host_1", 32, 4, false, (IDCCoreVar)vars[1], false, "Host_302", null, 0, false);
	subContainer_47.addSubInstruction(sub_198);
		ISubRule sub_199 = new SubRule("req_hdr_Referer_1", 0, 72, false, (IDCCoreVar)dcVars[7], false, "Referer_151", null, 0, false);
	subContainer_47.addSubInstruction(sub_199);
		ISubRule sub_200 = new SubRule("req_hdr_Host_1", 0, 31, false, (IDCCoreVar)vars[0], false, "Host_301", null, 0, false);
	subContainer_47.addSubInstruction(sub_200);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E9440FC20E3557DFEAE23864643438"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E9440FC20E3557DFEAE23864643438"), 3);		
		IConnectionRecord serverConnection = ConnectionRecordFactory.find(parent, 
				parallelGroup, connConfigName,
				true, // close connection at test boundary,
				null, 0, 1); // error behavior
		reqAction.io2=serverConnection.getHttp2ioConnector();
		IHTTPRequest req = new HTTPRequest(
			"GET",	// method
			"https",  // protocol - http or https
			url, isURLRelative,
			"1.1",	// version
			headers,
			IHTTPSessionTypes.STANDARD,
			0, // delay
			isPrimary,
			null,// post data
			basicAuth,
			serverConnection,
			reqAction,
			"ISO-8859-1",
			"ISO-8859-1",
			"A1E9440FC2216F03DFEAE23864643438",
			true,
			false
		);
		
		req.setExpectedResponseCode(200);
		req.setConnectionClose(connectionClose);
		

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("image/jpeg");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}

	public HTTPAction request_47(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1E9440FC221BD27DFEAE23864643438", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(7);
					
		headers.add(new RequestHeaderData("Host", "rptsvt-win21.nonprod.hclpnp.com:9443", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (X11; Linux x86_64; rv:65.0) Gecko/20100101 Firefox/65.0", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("Accept", "image/webp,*/*", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.5", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("Referer", "https://rptsvt-win21.nonprod.hclpnp.com:9443/PlantsByWebSphere/promo.jsf", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "ISO-8859-1", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_48 = new DataSub();
	reqAction.addDataSub(subContainer_48);

		ISubRule sub_201 = new SubRule("req_uri", 68, 5, true, (IDCCoreVar)dcVars[32], false, "inventoryID", null, 0, false);
	subContainer_48.addSubInstruction(sub_201);
		ISubRule sub_202 = new SubRule("req_uri", 47, 8, true, (IDCCoreVar)dcVars[12], false, "action", null, 0, false);
	subContainer_48.addSubInstruction(sub_202);
		ISubRule sub_203 = new SubRule("req_hdr_Host_1", 32, 4, false, (IDCCoreVar)vars[1], false, "Host_300", null, 0, false);
	subContainer_48.addSubInstruction(sub_203);
		ISubRule sub_204 = new SubRule("req_hdr_Referer_1", 0, 72, false, (IDCCoreVar)dcVars[7], false, "Referer_150", null, 0, false);
	subContainer_48.addSubInstruction(sub_204);
		ISubRule sub_205 = new SubRule("req_hdr_Host_1", 0, 31, false, (IDCCoreVar)vars[0], false, "Host_299", null, 0, false);
	subContainer_48.addSubInstruction(sub_205);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E9440FC20E3557DFEAE23864643438"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E9440FC20E3557DFEAE23864643438"), 3);		
		IConnectionRecord serverConnection = ConnectionRecordFactory.find(parent, 
				parallelGroup, connConfigName,
				true, // close connection at test boundary,
				null, 0, 1); // error behavior
		reqAction.io2=serverConnection.getHttp2ioConnector();
		IHTTPRequest req = new HTTPRequest(
			"GET",	// method
			"https",  // protocol - http or https
			url, isURLRelative,
			"1.1",	// version
			headers,
			IHTTPSessionTypes.STANDARD,
			0, // delay
			isPrimary,
			null,// post data
			basicAuth,
			serverConnection,
			reqAction,
			"ISO-8859-1",
			"ISO-8859-1",
			"A1E9440FC221BD2ADFEAE23864643438",
			true,
			false
		);
		
		req.setExpectedResponseCode(200);
		req.setConnectionClose(connectionClose);
		

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("image/jpeg");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}
private HTTPPage page_3(final IContainer parent) {
			HTTPThink think = new HTTPThink(2497, 1, parent, parent, "A1E9440FC2220B40DFEAE23864643438");
	parent.add(think);
	
		HTTPPage page = new HTTPPage(parent, "Plants By WebSphere Product Detail", "A1E9440FC2220B40DFEAE23864643438") {
			
			public void execute() {   
				
	
	
	
	
			             
			{ // Parallal Block Start
				HTTPParallel httpParallel = new HTTPParallel(6, this);
				this.add(httpParallel);

				// httpParallel.addRequest(int serial, HTTPAction action, int actionDelay, String firstCharSemID) 
				httpParallel.addRequest(0, request_48(this, true, "A1E9440FC20CFCA0DFEAE23864643438", false, true,
						"Config_1", "rptsvt-win21.nonprod.hclpnp.com:9443/PlantsByWebSphere/shopping.jsf",	"/PlantsByWebSphere/shopping.jsf", true, false), 0, 100, "null", 3);
				httpParallel.addRequest(1, request_49(this, false, "A1E9440FC20D4AC0DFEAE23864643438", false, false,
						"Config_1", "rptsvt-win21.nonprod.hclpnp.com:9443/PlantsByWebSphere/javax.faces.resource/oamSubmit.js.jsf?ln=org.apache.myfaces",	"/PlantsByWebSphere/javax.faces.resource/oamSubmit.js.jsf?ln=org.apache.myfaces", true, false), 26, 100, "A1E9440FC2220B44DFEAE23864643438", 2);
				httpParallel.addRequest(0, request_50(this, false, "A1E9440FC20CFCA0DFEAE23864643438", false, false,
						"Config_1", "rptsvt-win21.nonprod.hclpnp.com:9443/PlantsByWebSphere/javax.faces.resource/PlantMaster.css.jsf?ln=theme",	"/PlantsByWebSphere/javax.faces.resource/PlantMaster.css.jsf?ln=theme", true, false), 0, 100, "null", 3);
				httpParallel.addRequest(2, request_51(this, false, "A1E9440FC20C879CDFEAE23864643438", false, false,
						"Config_1", "rptsvt-win21.nonprod.hclpnp.com:9443/PlantsByWebSphere/javax.faces.resource/pbw.jpg.jsf?ln=images",	"/PlantsByWebSphere/javax.faces.resource/pbw.jpg.jsf?ln=images", true, false), 31, 100, "A1E9440FC2220B44DFEAE23864643438", 2);
				httpParallel.addRequest(1, request_52(this, false, "A1E9440FC20D4AC0DFEAE23864643438", false, false,
						"Config_1", "rptsvt-win21.nonprod.hclpnp.com:9443/PlantsByWebSphere/javax.faces.resource/1x1_trans.gif.jsf?ln=images",	"/PlantsByWebSphere/javax.faces.resource/1x1_trans.gif.jsf?ln=images", true, false), 0, 100, "null", 3);
				httpParallel.addRequest(0, request_53(this, false, "A1E9440FC20CFCA0DFEAE23864643438", false, false,
						"Config_1", "rptsvt-win21.nonprod.hclpnp.com:9443/PlantsByWebSphere/javax.faces.resource/item_selection.jpg.jsf?ln=images",	"/PlantsByWebSphere/javax.faces.resource/item_selection.jpg.jsf?ln=images", true, false), 0, 100, "null", 3);
				httpParallel.addRequest(3, request_54(this, false, "A1E9440FC20E0E10DFEAE23864643438", false, false,
						"Config_1", "rptsvt-win21.nonprod.hclpnp.com:9443/PlantsByWebSphere/javax.faces.resource/button_add_to_cart.gif.jsf?ln=images",	"/PlantsByWebSphere/javax.faces.resource/button_add_to_cart.gif.jsf?ln=images", true, false), 34, 100, "A1E9440FC2220B44DFEAE23864643438", 2);
				httpParallel.addRequest(1, request_55(this, false, "A1E9440FC20D4AC0DFEAE23864643438", false, false,
						"Config_1", "rptsvt-win21.nonprod.hclpnp.com:9443/PlantsByWebSphere/javax.faces.resource/tab_veggies_u.gif.jsf?ln=images",	"/PlantsByWebSphere/javax.faces.resource/tab_veggies_u.gif.jsf?ln=images", true, false), 0, 100, "null", 3);
				httpParallel.addRequest(0, request_56(this, false, "A1E9440FC20CFCA0DFEAE23864643438", false, false,
						"Config_1", "rptsvt-win21.nonprod.hclpnp.com:9443/PlantsByWebSphere/javax.faces.resource/tab_flowers_u.gif.jsf?ln=images",	"/PlantsByWebSphere/javax.faces.resource/tab_flowers_u.gif.jsf?ln=images", true, false), 0, 100, "null", 3);
				httpParallel.addRequest(2, request_57(this, false, "A1E9440FC20C879CDFEAE23864643438", false, false,
						"Config_1", "rptsvt-win21.nonprod.hclpnp.com:9443/PlantsByWebSphere/javax.faces.resource/tab_trees_u.gif.jsf?ln=images",	"/PlantsByWebSphere/javax.faces.resource/tab_trees_u.gif.jsf?ln=images", true, false), 0, 100, "null", 3);
				httpParallel.addRequest(4, request_58(this, false, "A1E9440FC20B9D10DFEAE23864643438", false, false,
						"Config_1", "rptsvt-win21.nonprod.hclpnp.com:9443/PlantsByWebSphere/javax.faces.resource/poweredby_WebSphere.gif.jsf?ln=images",	"/PlantsByWebSphere/javax.faces.resource/poweredby_WebSphere.gif.jsf?ln=images", true, false), 49, 100, "A1E9440FC2220B44DFEAE23864643438", 2);
				httpParallel.addRequest(3, request_59(this, false, "A1E9440FC20E0E10DFEAE23864643438", false, false,
						"Config_1", "rptsvt-win21.nonprod.hclpnp.com:9443/PlantsByWebSphere/javax.faces.resource/tab_accessories_u.gif.jsf?ln=images",	"/PlantsByWebSphere/javax.faces.resource/tab_accessories_u.gif.jsf?ln=images", true, false), 0, 100, "null", 3);
				httpParallel.addRequest(5, request_60(this, false, "A1E9440FC204BF40DFEAE23864643438", false, false,
						"Config_1", "rptsvt-win21.nonprod.hclpnp.com:9443/PlantsByWebSphere/servlet/ImageServlet?action=getimage&inventoryID=F0001",	"/PlantsByWebSphere/servlet/ImageServlet?action=getimage&inventoryID=F0001", true, false), 52, 100, "A1E9440FC2220B44DFEAE23864643438", 2);
			} // Parallal Block End 

			
				super.execute();
			}
		};
		
		
		page.setRemoveDelaysFromPageResponseTimes(false);
		page.setArmEnabled(false);  
		return page;
	}

	public HTTPAction request_48(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1E9440FC2220B44DFEAE23864643438", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(10);
					
		headers.add(new RequestHeaderData("Host", "rptsvt-win21.nonprod.hclpnp.com:9443", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (X11; Linux x86_64; rv:65.0) Gecko/20100101 Firefox/65.0", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("Accept", "text/html,application/xhtml+xml,application/xml;q=0.9,image/webp,*/*;q=0.8", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.5", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("Referer", "https://rptsvt-win21.nonprod.hclpnp.com:9443/PlantsByWebSphere/promo.jsf", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("Content-Type", "application/x-www-form-urlencoded", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("Content-Length", "232", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("Upgrade-Insecure-Requests", "1", "ISO-8859-1", 1));

				
			HTTPPostData postData = new HTTPPostData(reqAction, 0);
	
			postDataClass_2(postData);
				
		IBasicAuthentication basicAuth = null;
			IDataHarvester harvestContainer_3 = new DataHarvester();
	reqAction.addDataHarvester (harvestContainer_3);

	harvestContainer_3.addHarvestInstruction ("resp_hdr_Referer-RPT-Generated (read-only)_1", dcVars[34], ".*", 1, 0, 0, 0, false, "Referer-RPT-Generated (read-only)_3", null, 0, false);
	harvestContainer_3.addHarvestInstruction ("resp_content", dcVars[35], "\\?ln=(.*?)\"", 1, 1, 0, 0, false, "ln_129", null, 0, false);
	harvestContainer_3.addHarvestInstruction ("resp_content", dcVars[36], "\\?ln=(.*?)\"", 2, 1, 0, 0, false, "ln_128", null, 0, false);
	harvestContainer_3.addHarvestInstruction ("resp_content", dcVars[37], "\\?ln=(.*?)\"", 6, 4, 0, 0, false, "ln_130", null, 0, false);
	harvestContainer_3.addHarvestInstruction ("resp_content", dcVars[38], "<[[^>].]*?name=\"javax\\.faces\\.ViewState\"(([[^>].]*?value=\"(.*?)\")|(?:[[^>].]*?>))", 1, 1, 0, 0, false, "value_7", null, 0, false);
	harvestContainer_3.addHarvestInstruction ("resp_content", dcVars[39], "\\?action=(.*?)&", 1, 1, 0, 0, false, "action_65", null, 0, false);
	harvestContainer_3.addHarvestInstruction ("resp_content", dcVars[40], ";inventoryID=(.*?)\"", 1, 1, 0, 0, false, "inventoryID_84", null, 0, false);
	harvestContainer_3.addHarvestInstruction ("resp_content", dcVars[41], "<[[^>].]*?name=\"product:quantity\"(([[^>].]*?value=\"(.*?)\")|(?:[[^>].]*?>))", 1, 1, 0, 0, false, "value_5", null, 0, false);
	harvestContainer_3.addHarvestInstruction ("resp_content", dcVars[42], "<[[^>].]*?name=\"product_SUBMIT\"(([[^>].]*?value=\"(.*?)\")|(?:[[^>].]*?>))", 1, 1, 0, 0, false, "value_6", null, 0, false);
	IDataSub subContainer_50 = new DataSub();
	reqAction.addDataSub(subContainer_50);

		ISubRule sub_209 = new SubRule("req_hdr_Host_1", 32, 4, false, (IDCCoreVar)vars[1], false, "Host_298", null, 0, false);
	subContainer_50.addSubInstruction(sub_209);
		ISubRule sub_210 = new SubRule("req_hdr_Referer_1", 0, 72, false, (IDCCoreVar)dcVars[7], false, "Referer_149", null, 0, false);
	subContainer_50.addSubInstruction(sub_210);
		ISubRule sub_211 = new SubRule("req_hdr_Host_1", 0, 31, false, (IDCCoreVar)vars[0], false, "Host_297", null, 0, false);
	subContainer_50.addSubInstruction(sub_211);
	


		
				
		IConnectionRecord serverConnection = ConnectionRecordFactory.find(parent, 
				parallelGroup, connConfigName,
				true, // close connection at test boundary,
				null, 0, 1); // error behavior
		reqAction.io2=serverConnection.getHttp2ioConnector();
		IHTTPRequest req = new HTTPRequest(
			"POST",	// method
			"https",  // protocol - http or https
			url, isURLRelative,
			"1.1",	// version
			headers,
			IHTTPSessionTypes.STANDARD,
			0, // delay
			isPrimary,
			postData,// post data
			basicAuth,
			serverConnection,
			reqAction,
			"ISO-8859-1",
			"ISO-8859-1",
			"A1E9440FC2220B47DFEAE23864643438",
			true,
			false
		);
		
		req.setExpectedResponseCode(200);
		req.setConnectionClose(connectionClose);
		

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("text/html; charset=ISO-8859-1");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(true);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}
	private void postDataClass_2(HTTPPostData postData) {
				StringBuffer strBuf_2 = new StringBuffer();
strBuf_2.append("shopping_SUBMIT=1&javax.faces.ViewState=JOdHD0Nf8TsYahcFj50D");
strBuf_2.append("frpkzkvewAuNQNXTWRtgRZi1W6hd%2FpyfUtfv1cJ2F2thTctSC2gp8HSfw5");
strBuf_2.append("sI54sF8ht4pkSV4M2wGtu56YiiWgiRQYNcd8CReM7hg4g%3D&itemID=F000");
strBuf_2.append("1&shopping%3A_idcl=shopping%3Aj_id164039580_461abf1d");
String requestData_2 = strBuf_2.toString();
			
	HTTPPostDataChunk pdc_1 = new HTTPPostDataChunk("A1E9440FC2220B88DFEAE23864643438", postData, requestData_2, "ISO-8859-1", 134, 181);
	postData.addDataChunk(pdc_1);

	IDataSub subContainer_49 = new DataSub();
	pdc_1.addDataSub(subContainer_49);

		ISubRule sub_206 = new SubRule("req_content", 176, 5, true, (IDCCoreVar)dcVars[0], false, "itemID", null, 0, false);
	subContainer_49.addSubInstruction(sub_206);
		ISubRule sub_207 = new SubRule("req_content", 40, 128, true, (IDCCoreVar)dcVars[11], false, "javax.faces.ViewState", null, 0, false);
	subContainer_49.addSubInstruction(sub_207);
		ISubRule sub_208 = new SubRule("req_content", 16, 1, true, (IDCCoreVar)dcVars[33], false, "shopping_SUBMIT", null, 0, false);
	subContainer_49.addSubInstruction(sub_208);
	



	}

	public HTTPAction request_49(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1E9440FC222327EDFEAE23864643438", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(8);
					
		headers.add(new RequestHeaderData("Host", "rptsvt-win21.nonprod.hclpnp.com:9443", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (X11; Linux x86_64; rv:65.0) Gecko/20100101 Firefox/65.0", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("Accept", "*/*", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.5", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("Referer", "https://rptsvt-win21.nonprod.hclpnp.com:9443/PlantsByWebSphere/shopping.jsf", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("If-Modified-Since", "Tue, 26 Feb 2019 20:52:28 GMT", "ISO-8859-1", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_51 = new DataSub();
	reqAction.addDataSub(subContainer_51);

		ISubRule sub_212 = new SubRule("req_uri", 60, 18, true, (IDCCoreVar)dcVars[37], false, "ln", null, 0, false);
	subContainer_51.addSubInstruction(sub_212);
		ISubRule sub_213 = new SubRule("req_hdr_Host_1", 32, 4, false, (IDCCoreVar)vars[1], false, "Host_296", null, 0, false);
	subContainer_51.addSubInstruction(sub_213);
		ISubRule sub_214 = new SubRule("req_hdr_Referer_1", 0, 75, false, (IDCCoreVar)dcVars[34], false, "Referer_148", null, 0, false);
	subContainer_51.addSubInstruction(sub_214);
		ISubRule sub_215 = new SubRule("req_hdr_Host_1", 0, 31, false, (IDCCoreVar)vars[0], false, "Host_295", null, 0, false);
	subContainer_51.addSubInstruction(sub_215);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E9440FC2220B44DFEAE23864643438"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E9440FC2220B44DFEAE23864643438"), 3);		
		IConnectionRecord serverConnection = ConnectionRecordFactory.find(parent, 
				parallelGroup, connConfigName,
				true, // close connection at test boundary,
				null, 0, 1); // error behavior
		reqAction.io2=serverConnection.getHttp2ioConnector();
		IHTTPRequest req = new HTTPRequest(
			"GET",	// method
			"https",  // protocol - http or https
			url, isURLRelative,
			"1.1",	// version
			headers,
			IHTTPSessionTypes.STANDARD,
			0, // delay
			isPrimary,
			null,// post data
			basicAuth,
			serverConnection,
			reqAction,
			"ISO-8859-1",
			"ISO-8859-1",
			"A1E9440FC2223281DFEAE23864643438",
			true,
			false
		);
		
		req.setExpectedResponseCode(304);
		req.setConnectionClose(connectionClose);
		

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("https//");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}

	public HTTPAction request_50(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1E9440FC22259AADFEAE23864643438", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(8);
					
		headers.add(new RequestHeaderData("Host", "rptsvt-win21.nonprod.hclpnp.com:9443", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (X11; Linux x86_64; rv:65.0) Gecko/20100101 Firefox/65.0", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("Accept", "text/css,*/*;q=0.1", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.5", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("Referer", "https://rptsvt-win21.nonprod.hclpnp.com:9443/PlantsByWebSphere/shopping.jsf", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("If-Modified-Since", "Tue, 26 Feb 2019 20:52:28 GMT", "ISO-8859-1", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_52 = new DataSub();
	reqAction.addDataSub(subContainer_52);

		ISubRule sub_216 = new SubRule("req_uri", 63, 5, true, (IDCCoreVar)dcVars[35], false, "ln", null, 0, false);
	subContainer_52.addSubInstruction(sub_216);
		ISubRule sub_217 = new SubRule("req_hdr_Host_1", 32, 4, false, (IDCCoreVar)vars[1], false, "Host_294", null, 0, false);
	subContainer_52.addSubInstruction(sub_217);
		ISubRule sub_218 = new SubRule("req_hdr_Referer_1", 0, 75, false, (IDCCoreVar)dcVars[34], false, "Referer_147", null, 0, false);
	subContainer_52.addSubInstruction(sub_218);
		ISubRule sub_219 = new SubRule("req_hdr_Host_1", 0, 31, false, (IDCCoreVar)vars[0], false, "Host_293", null, 0, false);
	subContainer_52.addSubInstruction(sub_219);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E9440FC2220B44DFEAE23864643438"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E9440FC2220B44DFEAE23864643438"), 3);		
		IConnectionRecord serverConnection = ConnectionRecordFactory.find(parent, 
				parallelGroup, connConfigName,
				true, // close connection at test boundary,
				null, 0, 1); // error behavior
		reqAction.io2=serverConnection.getHttp2ioConnector();
		IHTTPRequest req = new HTTPRequest(
			"GET",	// method
			"https",  // protocol - http or https
			url, isURLRelative,
			"1.1",	// version
			headers,
			IHTTPSessionTypes.STANDARD,
			0, // delay
			isPrimary,
			null,// post data
			basicAuth,
			serverConnection,
			reqAction,
			"ISO-8859-1",
			"ISO-8859-1",
			"A1E9440FC22259ADDFEAE23864643438",
			true,
			false
		);
		
		req.setExpectedResponseCode(304);
		req.setConnectionClose(connectionClose);
		

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("https//");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}

	public HTTPAction request_51(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1E9440FC22280A3DFEAE23864643438", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(8);
					
		headers.add(new RequestHeaderData("Host", "rptsvt-win21.nonprod.hclpnp.com:9443", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (X11; Linux x86_64; rv:65.0) Gecko/20100101 Firefox/65.0", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("Accept", "image/webp,*/*", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.5", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("Referer", "https://rptsvt-win21.nonprod.hclpnp.com:9443/PlantsByWebSphere/shopping.jsf", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("If-Modified-Since", "Mon, 16 Jan 2012 21:43:22 GMT", "ISO-8859-1", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_53 = new DataSub();
	reqAction.addDataSub(subContainer_53);

		ISubRule sub_220 = new SubRule("req_uri", 55, 6, true, (IDCCoreVar)dcVars[36], false, "ln", null, 0, false);
	subContainer_53.addSubInstruction(sub_220);
		ISubRule sub_221 = new SubRule("req_hdr_Host_1", 32, 4, false, (IDCCoreVar)vars[1], false, "Host_292", null, 0, false);
	subContainer_53.addSubInstruction(sub_221);
		ISubRule sub_222 = new SubRule("req_hdr_Referer_1", 0, 75, false, (IDCCoreVar)dcVars[34], false, "Referer_146", null, 0, false);
	subContainer_53.addSubInstruction(sub_222);
		ISubRule sub_223 = new SubRule("req_hdr_Host_1", 0, 31, false, (IDCCoreVar)vars[0], false, "Host_291", null, 0, false);
	subContainer_53.addSubInstruction(sub_223);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E9440FC2220B44DFEAE23864643438"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E9440FC2220B44DFEAE23864643438"), 3);		
		IConnectionRecord serverConnection = ConnectionRecordFactory.find(parent, 
				parallelGroup, connConfigName,
				true, // close connection at test boundary,
				null, 0, 1); // error behavior
		reqAction.io2=serverConnection.getHttp2ioConnector();
		IHTTPRequest req = new HTTPRequest(
			"GET",	// method
			"https",  // protocol - http or https
			url, isURLRelative,
			"1.1",	// version
			headers,
			IHTTPSessionTypes.STANDARD,
			0, // delay
			isPrimary,
			null,// post data
			basicAuth,
			serverConnection,
			reqAction,
			"ISO-8859-1",
			"ISO-8859-1",
			"A1E9440FC22280A6DFEAE23864643438",
			true,
			false
		);
		
		req.setExpectedResponseCode(304);
		req.setConnectionClose(connectionClose);
		

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("https//");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}

	public HTTPAction request_52(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1E9440FC222A7A3DFEAE23864643438", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(8);
					
		headers.add(new RequestHeaderData("Host", "rptsvt-win21.nonprod.hclpnp.com:9443", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (X11; Linux x86_64; rv:65.0) Gecko/20100101 Firefox/65.0", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("Accept", "image/webp,*/*", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.5", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("Referer", "https://rptsvt-win21.nonprod.hclpnp.com:9443/PlantsByWebSphere/shopping.jsf", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("If-Modified-Since", "Mon, 16 Jan 2012 21:43:22 GMT", "ISO-8859-1", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_54 = new DataSub();
	reqAction.addDataSub(subContainer_54);

		ISubRule sub_224 = new SubRule("req_uri", 61, 6, true, (IDCCoreVar)dcVars[36], false, "ln", null, 0, false);
	subContainer_54.addSubInstruction(sub_224);
		ISubRule sub_225 = new SubRule("req_hdr_Host_1", 32, 4, false, (IDCCoreVar)vars[1], false, "Host_290", null, 0, false);
	subContainer_54.addSubInstruction(sub_225);
		ISubRule sub_226 = new SubRule("req_hdr_Referer_1", 0, 75, false, (IDCCoreVar)dcVars[34], false, "Referer_145", null, 0, false);
	subContainer_54.addSubInstruction(sub_226);
		ISubRule sub_227 = new SubRule("req_hdr_Host_1", 0, 31, false, (IDCCoreVar)vars[0], false, "Host_289", null, 0, false);
	subContainer_54.addSubInstruction(sub_227);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E9440FC2220B44DFEAE23864643438"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E9440FC2220B44DFEAE23864643438"), 3);		
		IConnectionRecord serverConnection = ConnectionRecordFactory.find(parent, 
				parallelGroup, connConfigName,
				true, // close connection at test boundary,
				null, 0, 1); // error behavior
		reqAction.io2=serverConnection.getHttp2ioConnector();
		IHTTPRequest req = new HTTPRequest(
			"GET",	// method
			"https",  // protocol - http or https
			url, isURLRelative,
			"1.1",	// version
			headers,
			IHTTPSessionTypes.STANDARD,
			0, // delay
			isPrimary,
			null,// post data
			basicAuth,
			serverConnection,
			reqAction,
			"ISO-8859-1",
			"ISO-8859-1",
			"A1E9440FC222A7A6DFEAE23864643438",
			true,
			false
		);
		
		req.setExpectedResponseCode(304);
		req.setConnectionClose(connectionClose);
		

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("https//");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}

	public HTTPAction request_53(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1E9440FC222CEB1DFEAE23864643438", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(8);
					
		headers.add(new RequestHeaderData("Host", "rptsvt-win21.nonprod.hclpnp.com:9443", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (X11; Linux x86_64; rv:65.0) Gecko/20100101 Firefox/65.0", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("Accept", "image/webp,*/*", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.5", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("Referer", "https://rptsvt-win21.nonprod.hclpnp.com:9443/PlantsByWebSphere/shopping.jsf", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("If-Modified-Since", "Mon, 16 Jan 2012 21:43:22 GMT", "ISO-8859-1", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_55 = new DataSub();
	reqAction.addDataSub(subContainer_55);

		ISubRule sub_228 = new SubRule("req_uri", 66, 6, true, (IDCCoreVar)dcVars[36], false, "ln", null, 0, false);
	subContainer_55.addSubInstruction(sub_228);
		ISubRule sub_229 = new SubRule("req_hdr_Host_1", 32, 4, false, (IDCCoreVar)vars[1], false, "Host_288", null, 0, false);
	subContainer_55.addSubInstruction(sub_229);
		ISubRule sub_230 = new SubRule("req_hdr_Referer_1", 0, 75, false, (IDCCoreVar)dcVars[34], false, "Referer_144", null, 0, false);
	subContainer_55.addSubInstruction(sub_230);
		ISubRule sub_231 = new SubRule("req_hdr_Host_1", 0, 31, false, (IDCCoreVar)vars[0], false, "Host_287", null, 0, false);
	subContainer_55.addSubInstruction(sub_231);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E9440FC2220B44DFEAE23864643438"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E9440FC2220B44DFEAE23864643438"), 3);		
		IConnectionRecord serverConnection = ConnectionRecordFactory.find(parent, 
				parallelGroup, connConfigName,
				true, // close connection at test boundary,
				null, 0, 1); // error behavior
		reqAction.io2=serverConnection.getHttp2ioConnector();
		IHTTPRequest req = new HTTPRequest(
			"GET",	// method
			"https",  // protocol - http or https
			url, isURLRelative,
			"1.1",	// version
			headers,
			IHTTPSessionTypes.STANDARD,
			0, // delay
			isPrimary,
			null,// post data
			basicAuth,
			serverConnection,
			reqAction,
			"ISO-8859-1",
			"ISO-8859-1",
			"A1E9440FC222CEB4DFEAE23864643438",
			true,
			false
		);
		
		req.setExpectedResponseCode(304);
		req.setConnectionClose(connectionClose);
		

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("https//");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}

	public HTTPAction request_54(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1E9440FC2245530DFEAE23864643438", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(8);
					
		headers.add(new RequestHeaderData("Host", "rptsvt-win21.nonprod.hclpnp.com:9443", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (X11; Linux x86_64; rv:65.0) Gecko/20100101 Firefox/65.0", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("Accept", "image/webp,*/*", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.5", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("Referer", "https://rptsvt-win21.nonprod.hclpnp.com:9443/PlantsByWebSphere/shopping.jsf", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("If-Modified-Since", "Mon, 16 Jan 2012 21:43:22 GMT", "ISO-8859-1", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_56 = new DataSub();
	reqAction.addDataSub(subContainer_56);

		ISubRule sub_232 = new SubRule("req_uri", 70, 6, true, (IDCCoreVar)dcVars[36], false, "ln", null, 0, false);
	subContainer_56.addSubInstruction(sub_232);
		ISubRule sub_233 = new SubRule("req_hdr_Host_1", 32, 4, false, (IDCCoreVar)vars[1], false, "Host_286", null, 0, false);
	subContainer_56.addSubInstruction(sub_233);
		ISubRule sub_234 = new SubRule("req_hdr_Referer_1", 0, 75, false, (IDCCoreVar)dcVars[34], false, "Referer_143", null, 0, false);
	subContainer_56.addSubInstruction(sub_234);
		ISubRule sub_235 = new SubRule("req_hdr_Host_1", 0, 31, false, (IDCCoreVar)vars[0], false, "Host_285", null, 0, false);
	subContainer_56.addSubInstruction(sub_235);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E9440FC2220B44DFEAE23864643438"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E9440FC2220B44DFEAE23864643438"), 3);		
		IConnectionRecord serverConnection = ConnectionRecordFactory.find(parent, 
				parallelGroup, connConfigName,
				true, // close connection at test boundary,
				null, 0, 1); // error behavior
		reqAction.io2=serverConnection.getHttp2ioConnector();
		IHTTPRequest req = new HTTPRequest(
			"GET",	// method
			"https",  // protocol - http or https
			url, isURLRelative,
			"1.1",	// version
			headers,
			IHTTPSessionTypes.STANDARD,
			0, // delay
			isPrimary,
			null,// post data
			basicAuth,
			serverConnection,
			reqAction,
			"ISO-8859-1",
			"ISO-8859-1",
			"A1E9440FC2245533DFEAE23864643438",
			true,
			false
		);
		
		req.setExpectedResponseCode(304);
		req.setConnectionClose(connectionClose);
		

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("https//");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}

	public HTTPAction request_55(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1E9440FC2247C40DFEAE23864643438", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(8);
					
		headers.add(new RequestHeaderData("Host", "rptsvt-win21.nonprod.hclpnp.com:9443", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (X11; Linux x86_64; rv:65.0) Gecko/20100101 Firefox/65.0", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("Accept", "image/webp,*/*", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.5", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("Referer", "https://rptsvt-win21.nonprod.hclpnp.com:9443/PlantsByWebSphere/shopping.jsf", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("If-Modified-Since", "Mon, 16 Jan 2012 21:43:22 GMT", "ISO-8859-1", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_57 = new DataSub();
	reqAction.addDataSub(subContainer_57);

		ISubRule sub_236 = new SubRule("req_uri", 65, 6, true, (IDCCoreVar)dcVars[36], false, "ln", null, 0, false);
	subContainer_57.addSubInstruction(sub_236);
		ISubRule sub_237 = new SubRule("req_hdr_Host_1", 32, 4, false, (IDCCoreVar)vars[1], false, "Host_284", null, 0, false);
	subContainer_57.addSubInstruction(sub_237);
		ISubRule sub_238 = new SubRule("req_hdr_Referer_1", 0, 75, false, (IDCCoreVar)dcVars[34], false, "Referer_142", null, 0, false);
	subContainer_57.addSubInstruction(sub_238);
		ISubRule sub_239 = new SubRule("req_hdr_Host_1", 0, 31, false, (IDCCoreVar)vars[0], false, "Host_283", null, 0, false);
	subContainer_57.addSubInstruction(sub_239);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E9440FC2220B44DFEAE23864643438"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E9440FC2220B44DFEAE23864643438"), 3);		
		IConnectionRecord serverConnection = ConnectionRecordFactory.find(parent, 
				parallelGroup, connConfigName,
				true, // close connection at test boundary,
				null, 0, 1); // error behavior
		reqAction.io2=serverConnection.getHttp2ioConnector();
		IHTTPRequest req = new HTTPRequest(
			"GET",	// method
			"https",  // protocol - http or https
			url, isURLRelative,
			"1.1",	// version
			headers,
			IHTTPSessionTypes.STANDARD,
			0, // delay
			isPrimary,
			null,// post data
			basicAuth,
			serverConnection,
			reqAction,
			"ISO-8859-1",
			"ISO-8859-1",
			"A1E9440FC2247C43DFEAE23864643438",
			true,
			false
		);
		
		req.setExpectedResponseCode(304);
		req.setConnectionClose(connectionClose);
		

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("https//");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}

	public HTTPAction request_56(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1E9440FC224CA60DFEAE23864643438", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(8);
					
		headers.add(new RequestHeaderData("Host", "rptsvt-win21.nonprod.hclpnp.com:9443", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (X11; Linux x86_64; rv:65.0) Gecko/20100101 Firefox/65.0", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("Accept", "image/webp,*/*", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.5", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("Referer", "https://rptsvt-win21.nonprod.hclpnp.com:9443/PlantsByWebSphere/shopping.jsf", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("If-Modified-Since", "Mon, 16 Jan 2012 21:43:20 GMT", "ISO-8859-1", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_58 = new DataSub();
	reqAction.addDataSub(subContainer_58);

		ISubRule sub_240 = new SubRule("req_uri", 65, 6, true, (IDCCoreVar)dcVars[36], false, "ln", null, 0, false);
	subContainer_58.addSubInstruction(sub_240);
		ISubRule sub_241 = new SubRule("req_hdr_Host_1", 32, 4, false, (IDCCoreVar)vars[1], false, "Host_282", null, 0, false);
	subContainer_58.addSubInstruction(sub_241);
		ISubRule sub_242 = new SubRule("req_hdr_Referer_1", 0, 75, false, (IDCCoreVar)dcVars[34], false, "Referer_141", null, 0, false);
	subContainer_58.addSubInstruction(sub_242);
		ISubRule sub_243 = new SubRule("req_hdr_Host_1", 0, 31, false, (IDCCoreVar)vars[0], false, "Host_281", null, 0, false);
	subContainer_58.addSubInstruction(sub_243);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E9440FC2220B44DFEAE23864643438"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E9440FC2220B44DFEAE23864643438"), 3);		
		IConnectionRecord serverConnection = ConnectionRecordFactory.find(parent, 
				parallelGroup, connConfigName,
				true, // close connection at test boundary,
				null, 0, 1); // error behavior
		reqAction.io2=serverConnection.getHttp2ioConnector();
		IHTTPRequest req = new HTTPRequest(
			"GET",	// method
			"https",  // protocol - http or https
			url, isURLRelative,
			"1.1",	// version
			headers,
			IHTTPSessionTypes.STANDARD,
			0, // delay
			isPrimary,
			null,// post data
			basicAuth,
			serverConnection,
			reqAction,
			"ISO-8859-1",
			"ISO-8859-1",
			"A1E9440FC224CA63DFEAE23864643438",
			true,
			false
		);
		
		req.setExpectedResponseCode(304);
		req.setConnectionClose(connectionClose);
		

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("https//");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}

	public HTTPAction request_57(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1E9440FC2251880DFEAE23864643438", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(8);
					
		headers.add(new RequestHeaderData("Host", "rptsvt-win21.nonprod.hclpnp.com:9443", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (X11; Linux x86_64; rv:65.0) Gecko/20100101 Firefox/65.0", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("Accept", "image/webp,*/*", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.5", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("Referer", "https://rptsvt-win21.nonprod.hclpnp.com:9443/PlantsByWebSphere/shopping.jsf", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("If-Modified-Since", "Mon, 16 Jan 2012 21:43:22 GMT", "ISO-8859-1", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_59 = new DataSub();
	reqAction.addDataSub(subContainer_59);

		ISubRule sub_244 = new SubRule("req_uri", 63, 6, true, (IDCCoreVar)dcVars[36], false, "ln", null, 0, false);
	subContainer_59.addSubInstruction(sub_244);
		ISubRule sub_245 = new SubRule("req_hdr_Host_1", 32, 4, false, (IDCCoreVar)vars[1], false, "Host_280", null, 0, false);
	subContainer_59.addSubInstruction(sub_245);
		ISubRule sub_246 = new SubRule("req_hdr_Referer_1", 0, 75, false, (IDCCoreVar)dcVars[34], false, "Referer_140", null, 0, false);
	subContainer_59.addSubInstruction(sub_246);
		ISubRule sub_247 = new SubRule("req_hdr_Host_1", 0, 31, false, (IDCCoreVar)vars[0], false, "Host_279", null, 0, false);
	subContainer_59.addSubInstruction(sub_247);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E9440FC2220B44DFEAE23864643438"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E9440FC2220B44DFEAE23864643438"), 3);		
		IConnectionRecord serverConnection = ConnectionRecordFactory.find(parent, 
				parallelGroup, connConfigName,
				true, // close connection at test boundary,
				null, 0, 1); // error behavior
		reqAction.io2=serverConnection.getHttp2ioConnector();
		IHTTPRequest req = new HTTPRequest(
			"GET",	// method
			"https",  // protocol - http or https
			url, isURLRelative,
			"1.1",	// version
			headers,
			IHTTPSessionTypes.STANDARD,
			0, // delay
			isPrimary,
			null,// post data
			basicAuth,
			serverConnection,
			reqAction,
			"ISO-8859-1",
			"ISO-8859-1",
			"A1E9440FC2251883DFEAE23864643438",
			true,
			false
		);
		
		req.setExpectedResponseCode(304);
		req.setConnectionClose(connectionClose);
		

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("https//");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}

	public HTTPAction request_58(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1E9440FC2253F9CDFEAE23864643438", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(8);
					
		headers.add(new RequestHeaderData("Host", "rptsvt-win21.nonprod.hclpnp.com:9443", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (X11; Linux x86_64; rv:65.0) Gecko/20100101 Firefox/65.0", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("Accept", "image/webp,*/*", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.5", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("Referer", "https://rptsvt-win21.nonprod.hclpnp.com:9443/PlantsByWebSphere/shopping.jsf", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("If-Modified-Since", "Mon, 16 Jan 2012 21:43:22 GMT", "ISO-8859-1", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_60 = new DataSub();
	reqAction.addDataSub(subContainer_60);

		ISubRule sub_248 = new SubRule("req_uri", 71, 6, true, (IDCCoreVar)dcVars[36], false, "ln", null, 0, false);
	subContainer_60.addSubInstruction(sub_248);
		ISubRule sub_249 = new SubRule("req_hdr_Host_1", 32, 4, false, (IDCCoreVar)vars[1], false, "Host_278", null, 0, false);
	subContainer_60.addSubInstruction(sub_249);
		ISubRule sub_250 = new SubRule("req_hdr_Referer_1", 0, 75, false, (IDCCoreVar)dcVars[34], false, "Referer_139", null, 0, false);
	subContainer_60.addSubInstruction(sub_250);
		ISubRule sub_251 = new SubRule("req_hdr_Host_1", 0, 31, false, (IDCCoreVar)vars[0], false, "Host_277", null, 0, false);
	subContainer_60.addSubInstruction(sub_251);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E9440FC2220B44DFEAE23864643438"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E9440FC2220B44DFEAE23864643438"), 3);		
		IConnectionRecord serverConnection = ConnectionRecordFactory.find(parent, 
				parallelGroup, connConfigName,
				true, // close connection at test boundary,
				null, 0, 1); // error behavior
		reqAction.io2=serverConnection.getHttp2ioConnector();
		IHTTPRequest req = new HTTPRequest(
			"GET",	// method
			"https",  // protocol - http or https
			url, isURLRelative,
			"1.1",	// version
			headers,
			IHTTPSessionTypes.STANDARD,
			0, // delay
			isPrimary,
			null,// post data
			basicAuth,
			serverConnection,
			reqAction,
			"ISO-8859-1",
			"ISO-8859-1",
			"A1E9440FC2253F9FDFEAE23864643438",
			true,
			false
		);
		
		req.setExpectedResponseCode(304);
		req.setConnectionClose(connectionClose);
		

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("https//");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}

	public HTTPAction request_59(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1E9440FC225B4C0DFEAE23864643438", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(8);
					
		headers.add(new RequestHeaderData("Host", "rptsvt-win21.nonprod.hclpnp.com:9443", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (X11; Linux x86_64; rv:65.0) Gecko/20100101 Firefox/65.0", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("Accept", "image/webp,*/*", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.5", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("Referer", "https://rptsvt-win21.nonprod.hclpnp.com:9443/PlantsByWebSphere/shopping.jsf", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("If-Modified-Since", "Mon, 16 Jan 2012 21:43:20 GMT", "ISO-8859-1", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_61 = new DataSub();
	reqAction.addDataSub(subContainer_61);

		ISubRule sub_252 = new SubRule("req_uri", 69, 6, true, (IDCCoreVar)dcVars[36], false, "ln", null, 0, false);
	subContainer_61.addSubInstruction(sub_252);
		ISubRule sub_253 = new SubRule("req_hdr_Host_1", 32, 4, false, (IDCCoreVar)vars[1], false, "Host_276", null, 0, false);
	subContainer_61.addSubInstruction(sub_253);
		ISubRule sub_254 = new SubRule("req_hdr_Referer_1", 0, 75, false, (IDCCoreVar)dcVars[34], false, "Referer_138", null, 0, false);
	subContainer_61.addSubInstruction(sub_254);
		ISubRule sub_255 = new SubRule("req_hdr_Host_1", 0, 31, false, (IDCCoreVar)vars[0], false, "Host_275", null, 0, false);
	subContainer_61.addSubInstruction(sub_255);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E9440FC2220B44DFEAE23864643438"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E9440FC2220B44DFEAE23864643438"), 3);		
		IConnectionRecord serverConnection = ConnectionRecordFactory.find(parent, 
				parallelGroup, connConfigName,
				true, // close connection at test boundary,
				null, 0, 1); // error behavior
		reqAction.io2=serverConnection.getHttp2ioConnector();
		IHTTPRequest req = new HTTPRequest(
			"GET",	// method
			"https",  // protocol - http or https
			url, isURLRelative,
			"1.1",	// version
			headers,
			IHTTPSessionTypes.STANDARD,
			0, // delay
			isPrimary,
			null,// post data
			basicAuth,
			serverConnection,
			reqAction,
			"ISO-8859-1",
			"ISO-8859-1",
			"A1E9440FC225B4C3DFEAE23864643438",
			true,
			false
		);
		
		req.setExpectedResponseCode(304);
		req.setConnectionClose(connectionClose);
		

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("https//");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}

	public HTTPAction request_60(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1E9440FC225DC19DFEAE23864643438", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(7);
					
		headers.add(new RequestHeaderData("Host", "rptsvt-win21.nonprod.hclpnp.com:9443", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (X11; Linux x86_64; rv:65.0) Gecko/20100101 Firefox/65.0", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("Accept", "image/webp,*/*", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.5", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("Referer", "https://rptsvt-win21.nonprod.hclpnp.com:9443/PlantsByWebSphere/shopping.jsf", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "ISO-8859-1", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_62 = new DataSub();
	reqAction.addDataSub(subContainer_62);

		ISubRule sub_256 = new SubRule("req_uri", 68, 5, true, (IDCCoreVar)dcVars[40], false, "inventoryID", null, 0, false);
	subContainer_62.addSubInstruction(sub_256);
		ISubRule sub_257 = new SubRule("req_uri", 47, 8, true, (IDCCoreVar)dcVars[39], false, "action", null, 0, false);
	subContainer_62.addSubInstruction(sub_257);
		ISubRule sub_258 = new SubRule("req_hdr_Host_1", 32, 4, false, (IDCCoreVar)vars[1], false, "Host_274", null, 0, false);
	subContainer_62.addSubInstruction(sub_258);
		ISubRule sub_259 = new SubRule("req_hdr_Referer_1", 0, 75, false, (IDCCoreVar)dcVars[34], false, "Referer_137", null, 0, false);
	subContainer_62.addSubInstruction(sub_259);
		ISubRule sub_260 = new SubRule("req_hdr_Host_1", 0, 31, false, (IDCCoreVar)vars[0], false, "Host_273", null, 0, false);
	subContainer_62.addSubInstruction(sub_260);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E9440FC2220B44DFEAE23864643438"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E9440FC2220B44DFEAE23864643438"), 3);		
		IConnectionRecord serverConnection = ConnectionRecordFactory.find(parent, 
				parallelGroup, connConfigName,
				true, // close connection at test boundary,
				null, 0, 1); // error behavior
		reqAction.io2=serverConnection.getHttp2ioConnector();
		IHTTPRequest req = new HTTPRequest(
			"GET",	// method
			"https",  // protocol - http or https
			url, isURLRelative,
			"1.1",	// version
			headers,
			IHTTPSessionTypes.STANDARD,
			0, // delay
			isPrimary,
			null,// post data
			basicAuth,
			serverConnection,
			reqAction,
			"ISO-8859-1",
			"ISO-8859-1",
			"A1E9440FC225DC1CDFEAE23864643438",
			true,
			false
		);
		
		req.setExpectedResponseCode(200);
		req.setConnectionClose(connectionClose);
		

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("image/jpeg");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}
private HTTPPage page_4(final IContainer parent) {
			HTTPThink think = new HTTPThink(1642, 1, parent, parent, "A1E9440FC2262A0FDFEAE23864643438");
	parent.add(think);
	
		HTTPPage page = new HTTPPage(parent, "Plants By WebSphere Shopping Cart", "A1E9440FC2262A0FDFEAE23864643438") {
			
			public void execute() {   
				
	
	
	
	
			             
			{ // Parallal Block Start
				HTTPParallel httpParallel = new HTTPParallel(6, this);
				this.add(httpParallel);

				// httpParallel.addRequest(int serial, HTTPAction action, int actionDelay, String firstCharSemID) 
				httpParallel.addRequest(0, request_61(this, true, "A1E9440FC20CFCA0DFEAE23864643438", false, true,
						"Config_1", "rptsvt-win21.nonprod.hclpnp.com:9443/PlantsByWebSphere/product.jsf",	"/PlantsByWebSphere/product.jsf", true, false), 0, 100, "null", 3);
				httpParallel.addRequest(0, request_62(this, false, "A1E9440FC20CFCA0DFEAE23864643438", false, false,
						"Config_1", "rptsvt-win21.nonprod.hclpnp.com:9443/PlantsByWebSphere/javax.faces.resource/PlantMaster.css.jsf?ln=theme",	"/PlantsByWebSphere/javax.faces.resource/PlantMaster.css.jsf?ln=theme", true, false), 0, 100, "null", 3);
				httpParallel.addRequest(0, request_63(this, false, "A1E9440FC20CFCA0DFEAE23864643438", false, false,
						"Config_1", "rptsvt-win21.nonprod.hclpnp.com:9443/PlantsByWebSphere/javax.faces.resource/jsf.js.jsf?ln=javax.faces&stage=Development",	"/PlantsByWebSphere/javax.faces.resource/jsf.js.jsf?ln=javax.faces&stage=Development", true, false), 0, 100, "null", 3);
				httpParallel.addRequest(0, request_64(this, false, "A1E9440FC20CFCA0DFEAE23864643438", false, false,
						"Config_1", "rptsvt-win21.nonprod.hclpnp.com:9443/PlantsByWebSphere/javax.faces.resource/button_recalculate.gif.jsf?ln=images",	"/PlantsByWebSphere/javax.faces.resource/button_recalculate.gif.jsf?ln=images", true, false), 0, 100, "null", 3);
				httpParallel.addRequest(1, request_65(this, false, "A1E9440FC20D4AC0DFEAE23864643438", false, false,
						"Config_1", "rptsvt-win21.nonprod.hclpnp.com:9443/PlantsByWebSphere/javax.faces.resource/1x1_trans.gif.jsf?ln=images",	"/PlantsByWebSphere/javax.faces.resource/1x1_trans.gif.jsf?ln=images", true, false), 90, 100, "A1E9440FC2262A13DFEAE23864643438", 2);
				httpParallel.addRequest(2, request_66(this, false, "A1E9440FC20E0E10DFEAE23864643438", false, false,
						"Config_1", "rptsvt-win21.nonprod.hclpnp.com:9443/PlantsByWebSphere/javax.faces.resource/tab_flowers_u.gif.jsf?ln=images",	"/PlantsByWebSphere/javax.faces.resource/tab_flowers_u.gif.jsf?ln=images", true, false), 91, 100, "A1E9440FC2262A13DFEAE23864643438", 2);
				httpParallel.addRequest(3, request_67(this, false, "A1E9440FC20C879CDFEAE23864643438", false, false,
						"Config_1", "rptsvt-win21.nonprod.hclpnp.com:9443/PlantsByWebSphere/javax.faces.resource/pbw.jpg.jsf?ln=images",	"/PlantsByWebSphere/javax.faces.resource/pbw.jpg.jsf?ln=images", true, false), 92, 100, "A1E9440FC2262A13DFEAE23864643438", 2);
				httpParallel.addRequest(4, request_68(this, false, "A1E9440FC20B9D10DFEAE23864643438", false, false,
						"Config_1", "rptsvt-win21.nonprod.hclpnp.com:9443/PlantsByWebSphere/javax.faces.resource/button_checkout_now.gif.jsf?ln=images",	"/PlantsByWebSphere/javax.faces.resource/button_checkout_now.gif.jsf?ln=images", true, false), 93, 100, "A1E9440FC2262A13DFEAE23864643438", 2);
				httpParallel.addRequest(0, request_69(this, false, "A1E9440FC20CFCA0DFEAE23864643438", false, false,
						"Config_1", "rptsvt-win21.nonprod.hclpnp.com:9443/PlantsByWebSphere/javax.faces.resource/button_continue_shopping.gif.jsf?ln=images",	"/PlantsByWebSphere/javax.faces.resource/button_continue_shopping.gif.jsf?ln=images", true, false), 0, 100, "null", 3);
				httpParallel.addRequest(5, request_70(this, false, "A1E9440FC204BF40DFEAE23864643438", false, false,
						"Config_1", "rptsvt-win21.nonprod.hclpnp.com:9443/PlantsByWebSphere/javax.faces.resource/tab_veggies_u.gif.jsf?ln=images",	"/PlantsByWebSphere/javax.faces.resource/tab_veggies_u.gif.jsf?ln=images", true, false), 97, 100, "A1E9440FC2262A13DFEAE23864643438", 2);
				httpParallel.addRequest(4, request_71(this, false, "A1E9440FC20B9D10DFEAE23864643438", false, false,
						"Config_1", "rptsvt-win21.nonprod.hclpnp.com:9443/PlantsByWebSphere/javax.faces.resource/tab_accessories_u.gif.jsf?ln=images",	"/PlantsByWebSphere/javax.faces.resource/tab_accessories_u.gif.jsf?ln=images", true, false), 0, 100, "null", 3);
				httpParallel.addRequest(3, request_72(this, false, "A1E9440FC20C879CDFEAE23864643438", false, false,
						"Config_1", "rptsvt-win21.nonprod.hclpnp.com:9443/PlantsByWebSphere/javax.faces.resource/poweredby_WebSphere.gif.jsf?ln=images",	"/PlantsByWebSphere/javax.faces.resource/poweredby_WebSphere.gif.jsf?ln=images", true, false), 0, 100, "null", 3);
				httpParallel.addRequest(5, request_73(this, false, "A1E9440FC204BF40DFEAE23864643438", true, false,
						"Config_1", "rptsvt-win21.nonprod.hclpnp.com:9443/PlantsByWebSphere/javax.faces.resource/tab_trees_u.gif.jsf?ln=images",	"/PlantsByWebSphere/javax.faces.resource/tab_trees_u.gif.jsf?ln=images", true, false), 0, 100, "null", 3);
			} // Parallal Block End 

			
				super.execute();
			}
		};
		
		
		page.setRemoveDelaysFromPageResponseTimes(false);
		page.setArmEnabled(false);  
		return page;
	}

	public HTTPAction request_61(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1E9440FC2262A13DFEAE23864643438", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(10);
					
		headers.add(new RequestHeaderData("Host", "rptsvt-win21.nonprod.hclpnp.com:9443", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (X11; Linux x86_64; rv:65.0) Gecko/20100101 Firefox/65.0", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("Accept", "text/html,application/xhtml+xml,application/xml;q=0.9,image/webp,*/*;q=0.8", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.5", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("Referer", "https://rptsvt-win21.nonprod.hclpnp.com:9443/PlantsByWebSphere/shopping.jsf", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("Content-Type", "application/x-www-form-urlencoded", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("Content-Length", "250", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("Upgrade-Insecure-Requests", "1", "ISO-8859-1", 1));

				
			HTTPPostData postData = new HTTPPostData(reqAction, 0);
	
			postDataClass_3(postData);
				
		IBasicAuthentication basicAuth = null;
			IDataHarvester harvestContainer_4 = new DataHarvester();
	reqAction.addDataHarvester (harvestContainer_4);

	harvestContainer_4.addHarvestInstruction ("resp_hdr_Referer-RPT-Generated (read-only)_1", dcVars[43], ".*", 1, 0, 0, 0, false, "Referer-RPT-Generated (read-only)_4", null, 0, false);
	harvestContainer_4.addHarvestInstruction ("resp_content", dcVars[44], "\\?ln=(.*?)\"", 1, 1, 0, 0, false, "ln_133", null, 0, false);
	harvestContainer_4.addHarvestInstruction ("resp_content", dcVars[45], "\\?ln=([[^=].]*?)&", 1, 1, 0, 0, false, "ln_132", null, 0, false);
	harvestContainer_4.addHarvestInstruction ("resp_content", dcVars[46], ";stage=(.*?)\"", 1, 1, 0, 0, false, "stage_4", null, 0, false);
	harvestContainer_4.addHarvestInstruction ("resp_content", dcVars[47], "\\?ln=(.*?)\"", 3, 1, 0, 0, false, "ln_131", null, 0, false);
	IDataSub subContainer_64 = new DataSub();
	reqAction.addDataSub(subContainer_64);

		ISubRule sub_265 = new SubRule("req_hdr_Host_1", 32, 4, false, (IDCCoreVar)vars[1], false, "Host_272", null, 0, false);
	subContainer_64.addSubInstruction(sub_265);
		ISubRule sub_266 = new SubRule("req_hdr_Referer_1", 0, 75, false, (IDCCoreVar)dcVars[34], false, "Referer_136", null, 0, false);
	subContainer_64.addSubInstruction(sub_266);
		ISubRule sub_267 = new SubRule("req_hdr_Host_1", 0, 31, false, (IDCCoreVar)vars[0], false, "Host_271", null, 0, false);
	subContainer_64.addSubInstruction(sub_267);
	


		
				
		IConnectionRecord serverConnection = ConnectionRecordFactory.find(parent, 
				parallelGroup, connConfigName,
				true, // close connection at test boundary,
				null, 0, 1); // error behavior
		reqAction.io2=serverConnection.getHttp2ioConnector();
		IHTTPRequest req = new HTTPRequest(
			"POST",	// method
			"https",  // protocol - http or https
			url, isURLRelative,
			"1.1",	// version
			headers,
			IHTTPSessionTypes.STANDARD,
			0, // delay
			isPrimary,
			postData,// post data
			basicAuth,
			serverConnection,
			reqAction,
			"ISO-8859-1",
			"ISO-8859-1",
			"A1E9440FC2262A16DFEAE23864643438",
			true,
			false
		);
		
		req.setExpectedResponseCode(200);
		req.setConnectionClose(connectionClose);
		

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("text/html; charset=ISO-8859-1");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(true);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}
	private void postDataClass_3(HTTPPostData postData) {
				StringBuffer strBuf_3 = new StringBuffer();
strBuf_3.append("product%3Aquantity=1&product_SUBMIT=1&javax.faces.ViewState=");
strBuf_3.append("JOdHD0Nf8TsYahcFj50DfrpkzkvewAuNQNXTWRtgRZi1W6hd%2FpyfUiJoB8");
strBuf_3.append("CyZbxz1eUoqSnYSv8xwbam7rsBZdqF8McB5yTO4qbBN0ksBvzfHwaOiNoXWI");
strBuf_3.append("H3djc%3D&itemID=F0001&product%3A_idcl=product%3Aj_id60473438");
strBuf_3.append("6_76f91bad");
String requestData_3 = strBuf_3.toString();
			
	HTTPPostDataChunk pdc_2 = new HTTPPostDataChunk("A1E9440FC2265100DFEAE23864643438", postData, requestData_3, "ISO-8859-1", 135, 201);
	postData.addDataChunk(pdc_2);

	IDataSub subContainer_63 = new DataSub();
	pdc_2.addDataSub(subContainer_63);

		ISubRule sub_261 = new SubRule("req_content", 196, 5, true, (IDCCoreVar)dcVars[0], false, "itemID", null, 0, false);
	subContainer_63.addSubInstruction(sub_261);
		ISubRule sub_262 = new SubRule("req_content", 60, 128, true, (IDCCoreVar)dcVars[38], false, "javax.faces.ViewState", null, 0, false);
	subContainer_63.addSubInstruction(sub_262);
		ISubRule sub_263 = new SubRule("req_content", 36, 1, true, (IDCCoreVar)dcVars[42], false, "product_SUBMIT", null, 0, false);
	subContainer_63.addSubInstruction(sub_263);
		ISubRule sub_264 = new SubRule("req_content", 19, 1, true, (IDCCoreVar)dcVars[41], false, "product%3Aquantity", null, 0, false);
	subContainer_63.addSubInstruction(sub_264);
	



	}

	public HTTPAction request_62(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1E9440FC2267825DFEAE23864643438", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(8);
					
		headers.add(new RequestHeaderData("Host", "rptsvt-win21.nonprod.hclpnp.com:9443", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (X11; Linux x86_64; rv:65.0) Gecko/20100101 Firefox/65.0", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("Accept", "text/css,*/*;q=0.1", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.5", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("Referer", "https://rptsvt-win21.nonprod.hclpnp.com:9443/PlantsByWebSphere/product.jsf", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("If-Modified-Since", "Tue, 26 Feb 2019 20:52:28 GMT", "ISO-8859-1", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_65 = new DataSub();
	reqAction.addDataSub(subContainer_65);

		ISubRule sub_268 = new SubRule("req_uri", 63, 5, true, (IDCCoreVar)dcVars[44], false, "ln", null, 0, false);
	subContainer_65.addSubInstruction(sub_268);
		ISubRule sub_269 = new SubRule("req_hdr_Host_1", 32, 4, false, (IDCCoreVar)vars[1], false, "Host_270", null, 0, false);
	subContainer_65.addSubInstruction(sub_269);
		ISubRule sub_270 = new SubRule("req_hdr_Referer_1", 0, 74, false, (IDCCoreVar)dcVars[43], false, "Referer_135", null, 0, false);
	subContainer_65.addSubInstruction(sub_270);
		ISubRule sub_271 = new SubRule("req_hdr_Host_1", 0, 31, false, (IDCCoreVar)vars[0], false, "Host_269", null, 0, false);
	subContainer_65.addSubInstruction(sub_271);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E9440FC2262A13DFEAE23864643438"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E9440FC2262A13DFEAE23864643438"), 3);		
		IConnectionRecord serverConnection = ConnectionRecordFactory.find(parent, 
				parallelGroup, connConfigName,
				true, // close connection at test boundary,
				null, 0, 1); // error behavior
		reqAction.io2=serverConnection.getHttp2ioConnector();
		IHTTPRequest req = new HTTPRequest(
			"GET",	// method
			"https",  // protocol - http or https
			url, isURLRelative,
			"1.1",	// version
			headers,
			IHTTPSessionTypes.STANDARD,
			0, // delay
			isPrimary,
			null,// post data
			basicAuth,
			serverConnection,
			reqAction,
			"ISO-8859-1",
			"ISO-8859-1",
			"A1E9440FC2267828DFEAE23864643438",
			true,
			false
		);
		
		req.setExpectedResponseCode(304);
		req.setConnectionClose(connectionClose);
		

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("https//");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}

	public HTTPAction request_63(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1E9440FC2269F20DFEAE23864643438", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(8);
					
		headers.add(new RequestHeaderData("Host", "rptsvt-win21.nonprod.hclpnp.com:9443", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (X11; Linux x86_64; rv:65.0) Gecko/20100101 Firefox/65.0", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("Accept", "*/*", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.5", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("Referer", "https://rptsvt-win21.nonprod.hclpnp.com:9443/PlantsByWebSphere/product.jsf", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("If-Modified-Since", "Wed, 07 Feb 2018 20:32:00 GMT", "ISO-8859-1", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_66 = new DataSub();
	reqAction.addDataSub(subContainer_66);

		ISubRule sub_272 = new SubRule("req_uri", 72, 11, true, (IDCCoreVar)dcVars[46], false, "stage", null, 0, false);
	subContainer_66.addSubInstruction(sub_272);
		ISubRule sub_273 = new SubRule("req_uri", 54, 11, true, (IDCCoreVar)dcVars[45], false, "ln", null, 0, false);
	subContainer_66.addSubInstruction(sub_273);
		ISubRule sub_274 = new SubRule("req_hdr_Host_1", 32, 4, false, (IDCCoreVar)vars[1], false, "Host_268", null, 0, false);
	subContainer_66.addSubInstruction(sub_274);
		ISubRule sub_275 = new SubRule("req_hdr_Referer_1", 0, 74, false, (IDCCoreVar)dcVars[43], false, "Referer_134", null, 0, false);
	subContainer_66.addSubInstruction(sub_275);
		ISubRule sub_276 = new SubRule("req_hdr_Host_1", 0, 31, false, (IDCCoreVar)vars[0], false, "Host_267", null, 0, false);
	subContainer_66.addSubInstruction(sub_276);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E9440FC2262A13DFEAE23864643438"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E9440FC2262A13DFEAE23864643438"), 3);		
		IConnectionRecord serverConnection = ConnectionRecordFactory.find(parent, 
				parallelGroup, connConfigName,
				true, // close connection at test boundary,
				null, 0, 1); // error behavior
		reqAction.io2=serverConnection.getHttp2ioConnector();
		IHTTPRequest req = new HTTPRequest(
			"GET",	// method
			"https",  // protocol - http or https
			url, isURLRelative,
			"1.1",	// version
			headers,
			IHTTPSessionTypes.STANDARD,
			0, // delay
			isPrimary,
			null,// post data
			basicAuth,
			serverConnection,
			reqAction,
			"ISO-8859-1",
			"ISO-8859-1",
			"A1E9440FC2269F23DFEAE23864643438",
			true,
			false
		);
		
		req.setExpectedResponseCode(304);
		req.setConnectionClose(connectionClose);
		

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("https//");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}

	public HTTPAction request_64(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1E9440FC227FEB0DFEAE23864643438", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(8);
					
		headers.add(new RequestHeaderData("Host", "rptsvt-win21.nonprod.hclpnp.com:9443", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (X11; Linux x86_64; rv:65.0) Gecko/20100101 Firefox/65.0", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("Accept", "image/webp,*/*", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.5", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("Referer", "https://rptsvt-win21.nonprod.hclpnp.com:9443/PlantsByWebSphere/product.jsf", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("If-Modified-Since", "Mon, 16 Jan 2012 21:43:22 GMT", "ISO-8859-1", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_67 = new DataSub();
	reqAction.addDataSub(subContainer_67);

		ISubRule sub_277 = new SubRule("req_uri", 70, 6, true, (IDCCoreVar)dcVars[47], false, "ln", null, 0, false);
	subContainer_67.addSubInstruction(sub_277);
		ISubRule sub_278 = new SubRule("req_hdr_Host_1", 32, 4, false, (IDCCoreVar)vars[1], false, "Host_266", null, 0, false);
	subContainer_67.addSubInstruction(sub_278);
		ISubRule sub_279 = new SubRule("req_hdr_Referer_1", 0, 74, false, (IDCCoreVar)dcVars[43], false, "Referer_133", null, 0, false);
	subContainer_67.addSubInstruction(sub_279);
		ISubRule sub_280 = new SubRule("req_hdr_Host_1", 0, 31, false, (IDCCoreVar)vars[0], false, "Host_265", null, 0, false);
	subContainer_67.addSubInstruction(sub_280);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E9440FC2262A13DFEAE23864643438"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E9440FC2262A13DFEAE23864643438"), 3);		
		IConnectionRecord serverConnection = ConnectionRecordFactory.find(parent, 
				parallelGroup, connConfigName,
				true, // close connection at test boundary,
				null, 0, 1); // error behavior
		reqAction.io2=serverConnection.getHttp2ioConnector();
		IHTTPRequest req = new HTTPRequest(
			"GET",	// method
			"https",  // protocol - http or https
			url, isURLRelative,
			"1.1",	// version
			headers,
			IHTTPSessionTypes.STANDARD,
			0, // delay
			isPrimary,
			null,// post data
			basicAuth,
			serverConnection,
			reqAction,
			"ISO-8859-1",
			"ISO-8859-1",
			"A1E9440FC227FEB3DFEAE23864643438",
			true,
			false
		);
		
		req.setExpectedResponseCode(304);
		req.setConnectionClose(connectionClose);
		

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("https//");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}

	public HTTPAction request_65(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1E9440FC229D370DFEAE23864643438", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(8);
					
		headers.add(new RequestHeaderData("Host", "rptsvt-win21.nonprod.hclpnp.com:9443", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (X11; Linux x86_64; rv:65.0) Gecko/20100101 Firefox/65.0", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("Accept", "image/webp,*/*", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.5", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("Referer", "https://rptsvt-win21.nonprod.hclpnp.com:9443/PlantsByWebSphere/product.jsf", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("If-Modified-Since", "Mon, 16 Jan 2012 21:43:22 GMT", "ISO-8859-1", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_68 = new DataSub();
	reqAction.addDataSub(subContainer_68);

		ISubRule sub_281 = new SubRule("req_uri", 61, 6, true, (IDCCoreVar)dcVars[47], false, "ln", null, 0, false);
	subContainer_68.addSubInstruction(sub_281);
		ISubRule sub_282 = new SubRule("req_hdr_Host_1", 32, 4, false, (IDCCoreVar)vars[1], false, "Host_264", null, 0, false);
	subContainer_68.addSubInstruction(sub_282);
		ISubRule sub_283 = new SubRule("req_hdr_Referer_1", 0, 74, false, (IDCCoreVar)dcVars[43], false, "Referer_132", null, 0, false);
	subContainer_68.addSubInstruction(sub_283);
		ISubRule sub_284 = new SubRule("req_hdr_Host_1", 0, 31, false, (IDCCoreVar)vars[0], false, "Host_263", null, 0, false);
	subContainer_68.addSubInstruction(sub_284);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E9440FC2262A13DFEAE23864643438"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E9440FC2262A13DFEAE23864643438"), 3);		
		IConnectionRecord serverConnection = ConnectionRecordFactory.find(parent, 
				parallelGroup, connConfigName,
				true, // close connection at test boundary,
				null, 0, 1); // error behavior
		reqAction.io2=serverConnection.getHttp2ioConnector();
		IHTTPRequest req = new HTTPRequest(
			"GET",	// method
			"https",  // protocol - http or https
			url, isURLRelative,
			"1.1",	// version
			headers,
			IHTTPSessionTypes.STANDARD,
			0, // delay
			isPrimary,
			null,// post data
			basicAuth,
			serverConnection,
			reqAction,
			"ISO-8859-1",
			"ISO-8859-1",
			"A1E9440FC229D373DFEAE23864643438",
			true,
			false
		);
		
		req.setExpectedResponseCode(304);
		req.setConnectionClose(connectionClose);
		

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("https//");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}

	public HTTPAction request_66(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1E9440FC229FA97DFEAE23864643438", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(8);
					
		headers.add(new RequestHeaderData("Host", "rptsvt-win21.nonprod.hclpnp.com:9443", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (X11; Linux x86_64; rv:65.0) Gecko/20100101 Firefox/65.0", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("Accept", "image/webp,*/*", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.5", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("Referer", "https://rptsvt-win21.nonprod.hclpnp.com:9443/PlantsByWebSphere/product.jsf", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("If-Modified-Since", "Mon, 16 Jan 2012 21:43:20 GMT", "ISO-8859-1", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_69 = new DataSub();
	reqAction.addDataSub(subContainer_69);

		ISubRule sub_285 = new SubRule("req_uri", 65, 6, true, (IDCCoreVar)dcVars[47], false, "ln", null, 0, false);
	subContainer_69.addSubInstruction(sub_285);
		ISubRule sub_286 = new SubRule("req_hdr_Host_1", 32, 4, false, (IDCCoreVar)vars[1], false, "Host_262", null, 0, false);
	subContainer_69.addSubInstruction(sub_286);
		ISubRule sub_287 = new SubRule("req_hdr_Referer_1", 0, 74, false, (IDCCoreVar)dcVars[43], false, "Referer_131", null, 0, false);
	subContainer_69.addSubInstruction(sub_287);
		ISubRule sub_288 = new SubRule("req_hdr_Host_1", 0, 31, false, (IDCCoreVar)vars[0], false, "Host_261", null, 0, false);
	subContainer_69.addSubInstruction(sub_288);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E9440FC2262A13DFEAE23864643438"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E9440FC2262A13DFEAE23864643438"), 3);		
		IConnectionRecord serverConnection = ConnectionRecordFactory.find(parent, 
				parallelGroup, connConfigName,
				true, // close connection at test boundary,
				null, 0, 1); // error behavior
		reqAction.io2=serverConnection.getHttp2ioConnector();
		IHTTPRequest req = new HTTPRequest(
			"GET",	// method
			"https",  // protocol - http or https
			url, isURLRelative,
			"1.1",	// version
			headers,
			IHTTPSessionTypes.STANDARD,
			0, // delay
			isPrimary,
			null,// post data
			basicAuth,
			serverConnection,
			reqAction,
			"ISO-8859-1",
			"ISO-8859-1",
			"A1E9440FC229FA9ADFEAE23864643438",
			true,
			false
		);
		
		req.setExpectedResponseCode(304);
		req.setConnectionClose(connectionClose);
		

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("https//");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}

	public HTTPAction request_67(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1E9440FC22A21A3DFEAE23864643438", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(8);
					
		headers.add(new RequestHeaderData("Host", "rptsvt-win21.nonprod.hclpnp.com:9443", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (X11; Linux x86_64; rv:65.0) Gecko/20100101 Firefox/65.0", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("Accept", "image/webp,*/*", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.5", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("Referer", "https://rptsvt-win21.nonprod.hclpnp.com:9443/PlantsByWebSphere/product.jsf", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("If-Modified-Since", "Mon, 16 Jan 2012 21:43:22 GMT", "ISO-8859-1", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_70 = new DataSub();
	reqAction.addDataSub(subContainer_70);

		ISubRule sub_289 = new SubRule("req_uri", 55, 6, true, (IDCCoreVar)dcVars[47], false, "ln", null, 0, false);
	subContainer_70.addSubInstruction(sub_289);
		ISubRule sub_290 = new SubRule("req_hdr_Host_1", 32, 4, false, (IDCCoreVar)vars[1], false, "Host_260", null, 0, false);
	subContainer_70.addSubInstruction(sub_290);
		ISubRule sub_291 = new SubRule("req_hdr_Referer_1", 0, 74, false, (IDCCoreVar)dcVars[43], false, "Referer_130", null, 0, false);
	subContainer_70.addSubInstruction(sub_291);
		ISubRule sub_292 = new SubRule("req_hdr_Host_1", 0, 31, false, (IDCCoreVar)vars[0], false, "Host_259", null, 0, false);
	subContainer_70.addSubInstruction(sub_292);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E9440FC2262A13DFEAE23864643438"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E9440FC2262A13DFEAE23864643438"), 3);		
		IConnectionRecord serverConnection = ConnectionRecordFactory.find(parent, 
				parallelGroup, connConfigName,
				true, // close connection at test boundary,
				null, 0, 1); // error behavior
		reqAction.io2=serverConnection.getHttp2ioConnector();
		IHTTPRequest req = new HTTPRequest(
			"GET",	// method
			"https",  // protocol - http or https
			url, isURLRelative,
			"1.1",	// version
			headers,
			IHTTPSessionTypes.STANDARD,
			0, // delay
			isPrimary,
			null,// post data
			basicAuth,
			serverConnection,
			reqAction,
			"ISO-8859-1",
			"ISO-8859-1",
			"A1E9440FC22A21A6DFEAE23864643438",
			true,
			false
		);
		
		req.setExpectedResponseCode(304);
		req.setConnectionClose(connectionClose);
		

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("https//");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}

	public HTTPAction request_68(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1E9440FC22A21F6DFEAE23864643438", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(8);
					
		headers.add(new RequestHeaderData("Host", "rptsvt-win21.nonprod.hclpnp.com:9443", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (X11; Linux x86_64; rv:65.0) Gecko/20100101 Firefox/65.0", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("Accept", "image/webp,*/*", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.5", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("Referer", "https://rptsvt-win21.nonprod.hclpnp.com:9443/PlantsByWebSphere/product.jsf", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("If-Modified-Since", "Mon, 16 Jan 2012 21:43:22 GMT", "ISO-8859-1", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_71 = new DataSub();
	reqAction.addDataSub(subContainer_71);

		ISubRule sub_293 = new SubRule("req_uri", 71, 6, true, (IDCCoreVar)dcVars[47], false, "ln", null, 0, false);
	subContainer_71.addSubInstruction(sub_293);
		ISubRule sub_294 = new SubRule("req_hdr_Host_1", 32, 4, false, (IDCCoreVar)vars[1], false, "Host_258", null, 0, false);
	subContainer_71.addSubInstruction(sub_294);
		ISubRule sub_295 = new SubRule("req_hdr_Referer_1", 0, 74, false, (IDCCoreVar)dcVars[43], false, "Referer_129", null, 0, false);
	subContainer_71.addSubInstruction(sub_295);
		ISubRule sub_296 = new SubRule("req_hdr_Host_1", 0, 31, false, (IDCCoreVar)vars[0], false, "Host_257", null, 0, false);
	subContainer_71.addSubInstruction(sub_296);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E9440FC2262A13DFEAE23864643438"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E9440FC2262A13DFEAE23864643438"), 3);		
		IConnectionRecord serverConnection = ConnectionRecordFactory.find(parent, 
				parallelGroup, connConfigName,
				true, // close connection at test boundary,
				null, 0, 1); // error behavior
		reqAction.io2=serverConnection.getHttp2ioConnector();
		IHTTPRequest req = new HTTPRequest(
			"GET",	// method
			"https",  // protocol - http or https
			url, isURLRelative,
			"1.1",	// version
			headers,
			IHTTPSessionTypes.STANDARD,
			0, // delay
			isPrimary,
			null,// post data
			basicAuth,
			serverConnection,
			reqAction,
			"ISO-8859-1",
			"ISO-8859-1",
			"A1E9440FC22A21F9DFEAE23864643438",
			true,
			false
		);
		
		req.setExpectedResponseCode(304);
		req.setConnectionClose(connectionClose);
		

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("https//");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}

	public HTTPAction request_69(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1E9440FC22A48EDDFEAE23864643438", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(8);
					
		headers.add(new RequestHeaderData("Host", "rptsvt-win21.nonprod.hclpnp.com:9443", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (X11; Linux x86_64; rv:65.0) Gecko/20100101 Firefox/65.0", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("Accept", "image/webp,*/*", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.5", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("Referer", "https://rptsvt-win21.nonprod.hclpnp.com:9443/PlantsByWebSphere/product.jsf", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("If-Modified-Since", "Mon, 16 Jan 2012 21:43:22 GMT", "ISO-8859-1", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_72 = new DataSub();
	reqAction.addDataSub(subContainer_72);

		ISubRule sub_297 = new SubRule("req_uri", 76, 6, true, (IDCCoreVar)dcVars[47], false, "ln", null, 0, false);
	subContainer_72.addSubInstruction(sub_297);
		ISubRule sub_298 = new SubRule("req_hdr_Host_1", 32, 4, false, (IDCCoreVar)vars[1], false, "Host_256", null, 0, false);
	subContainer_72.addSubInstruction(sub_298);
		ISubRule sub_299 = new SubRule("req_hdr_Referer_1", 0, 74, false, (IDCCoreVar)dcVars[43], false, "Referer_128", null, 0, false);
	subContainer_72.addSubInstruction(sub_299);
		ISubRule sub_300 = new SubRule("req_hdr_Host_1", 0, 31, false, (IDCCoreVar)vars[0], false, "Host_255", null, 0, false);
	subContainer_72.addSubInstruction(sub_300);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E9440FC2262A13DFEAE23864643438"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E9440FC2262A13DFEAE23864643438"), 3);		
		IConnectionRecord serverConnection = ConnectionRecordFactory.find(parent, 
				parallelGroup, connConfigName,
				true, // close connection at test boundary,
				null, 0, 1); // error behavior
		reqAction.io2=serverConnection.getHttp2ioConnector();
		IHTTPRequest req = new HTTPRequest(
			"GET",	// method
			"https",  // protocol - http or https
			url, isURLRelative,
			"1.1",	// version
			headers,
			IHTTPSessionTypes.STANDARD,
			0, // delay
			isPrimary,
			null,// post data
			basicAuth,
			serverConnection,
			reqAction,
			"ISO-8859-1",
			"ISO-8859-1",
			"A1E9440FC22A48F0DFEAE23864643438",
			true,
			false
		);
		
		req.setExpectedResponseCode(304);
		req.setConnectionClose(connectionClose);
		

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("https//");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}

	public HTTPAction request_70(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1E9440FC22A6FDBDFEAE23864643438", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(8);
					
		headers.add(new RequestHeaderData("Host", "rptsvt-win21.nonprod.hclpnp.com:9443", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (X11; Linux x86_64; rv:65.0) Gecko/20100101 Firefox/65.0", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("Accept", "image/webp,*/*", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.5", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("Referer", "https://rptsvt-win21.nonprod.hclpnp.com:9443/PlantsByWebSphere/product.jsf", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("If-Modified-Since", "Mon, 16 Jan 2012 21:43:22 GMT", "ISO-8859-1", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_73 = new DataSub();
	reqAction.addDataSub(subContainer_73);

		ISubRule sub_301 = new SubRule("req_uri", 65, 6, true, (IDCCoreVar)dcVars[47], false, "ln", null, 0, false);
	subContainer_73.addSubInstruction(sub_301);
		ISubRule sub_302 = new SubRule("req_hdr_Host_1", 32, 4, false, (IDCCoreVar)vars[1], false, "Host_254", null, 0, false);
	subContainer_73.addSubInstruction(sub_302);
		ISubRule sub_303 = new SubRule("req_hdr_Referer_1", 0, 74, false, (IDCCoreVar)dcVars[43], false, "Referer_127", null, 0, false);
	subContainer_73.addSubInstruction(sub_303);
		ISubRule sub_304 = new SubRule("req_hdr_Host_1", 0, 31, false, (IDCCoreVar)vars[0], false, "Host_253", null, 0, false);
	subContainer_73.addSubInstruction(sub_304);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E9440FC2262A13DFEAE23864643438"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E9440FC2262A13DFEAE23864643438"), 3);		
		IConnectionRecord serverConnection = ConnectionRecordFactory.find(parent, 
				parallelGroup, connConfigName,
				true, // close connection at test boundary,
				null, 0, 1); // error behavior
		reqAction.io2=serverConnection.getHttp2ioConnector();
		IHTTPRequest req = new HTTPRequest(
			"GET",	// method
			"https",  // protocol - http or https
			url, isURLRelative,
			"1.1",	// version
			headers,
			IHTTPSessionTypes.STANDARD,
			0, // delay
			isPrimary,
			null,// post data
			basicAuth,
			serverConnection,
			reqAction,
			"ISO-8859-1",
			"ISO-8859-1",
			"A1E9440FC22A6FDEDFEAE23864643438",
			true,
			false
		);
		
		req.setExpectedResponseCode(304);
		req.setConnectionClose(connectionClose);
		

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("https//");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}

	public HTTPAction request_71(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1E9440FC22A96D7DFEAE23864643438", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(8);
					
		headers.add(new RequestHeaderData("Host", "rptsvt-win21.nonprod.hclpnp.com:9443", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (X11; Linux x86_64; rv:65.0) Gecko/20100101 Firefox/65.0", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("Accept", "image/webp,*/*", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.5", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("Referer", "https://rptsvt-win21.nonprod.hclpnp.com:9443/PlantsByWebSphere/product.jsf", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("If-Modified-Since", "Mon, 16 Jan 2012 21:43:20 GMT", "ISO-8859-1", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_74 = new DataSub();
	reqAction.addDataSub(subContainer_74);

		ISubRule sub_305 = new SubRule("req_uri", 69, 6, true, (IDCCoreVar)dcVars[47], false, "ln", null, 0, false);
	subContainer_74.addSubInstruction(sub_305);
		ISubRule sub_306 = new SubRule("req_hdr_Host_1", 32, 4, false, (IDCCoreVar)vars[1], false, "Host_252", null, 0, false);
	subContainer_74.addSubInstruction(sub_306);
		ISubRule sub_307 = new SubRule("req_hdr_Referer_1", 0, 74, false, (IDCCoreVar)dcVars[43], false, "Referer_126", null, 0, false);
	subContainer_74.addSubInstruction(sub_307);
		ISubRule sub_308 = new SubRule("req_hdr_Host_1", 0, 31, false, (IDCCoreVar)vars[0], false, "Host_251", null, 0, false);
	subContainer_74.addSubInstruction(sub_308);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E9440FC2262A13DFEAE23864643438"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E9440FC2262A13DFEAE23864643438"), 3);		
		IConnectionRecord serverConnection = ConnectionRecordFactory.find(parent, 
				parallelGroup, connConfigName,
				true, // close connection at test boundary,
				null, 0, 1); // error behavior
		reqAction.io2=serverConnection.getHttp2ioConnector();
		IHTTPRequest req = new HTTPRequest(
			"GET",	// method
			"https",  // protocol - http or https
			url, isURLRelative,
			"1.1",	// version
			headers,
			IHTTPSessionTypes.STANDARD,
			0, // delay
			isPrimary,
			null,// post data
			basicAuth,
			serverConnection,
			reqAction,
			"ISO-8859-1",
			"ISO-8859-1",
			"A1E9440FC22A96DADFEAE23864643438",
			true,
			false
		);
		
		req.setExpectedResponseCode(304);
		req.setConnectionClose(connectionClose);
		

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("https//");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}

	public HTTPAction request_72(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1E9440FC22ABDDFDFEAE23864643438", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(8);
					
		headers.add(new RequestHeaderData("Host", "rptsvt-win21.nonprod.hclpnp.com:9443", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (X11; Linux x86_64; rv:65.0) Gecko/20100101 Firefox/65.0", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("Accept", "image/webp,*/*", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.5", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("Referer", "https://rptsvt-win21.nonprod.hclpnp.com:9443/PlantsByWebSphere/product.jsf", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("If-Modified-Since", "Mon, 16 Jan 2012 21:43:22 GMT", "ISO-8859-1", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_75 = new DataSub();
	reqAction.addDataSub(subContainer_75);

		ISubRule sub_309 = new SubRule("req_uri", 71, 6, true, (IDCCoreVar)dcVars[47], false, "ln", null, 0, false);
	subContainer_75.addSubInstruction(sub_309);
		ISubRule sub_310 = new SubRule("req_hdr_Host_1", 32, 4, false, (IDCCoreVar)vars[1], false, "Host_250", null, 0, false);
	subContainer_75.addSubInstruction(sub_310);
		ISubRule sub_311 = new SubRule("req_hdr_Referer_1", 0, 74, false, (IDCCoreVar)dcVars[43], false, "Referer_125", null, 0, false);
	subContainer_75.addSubInstruction(sub_311);
		ISubRule sub_312 = new SubRule("req_hdr_Host_1", 0, 31, false, (IDCCoreVar)vars[0], false, "Host_249", null, 0, false);
	subContainer_75.addSubInstruction(sub_312);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E9440FC2262A13DFEAE23864643438"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E9440FC2262A13DFEAE23864643438"), 3);		
		IConnectionRecord serverConnection = ConnectionRecordFactory.find(parent, 
				parallelGroup, connConfigName,
				true, // close connection at test boundary,
				null, 0, 1); // error behavior
		reqAction.io2=serverConnection.getHttp2ioConnector();
		IHTTPRequest req = new HTTPRequest(
			"GET",	// method
			"https",  // protocol - http or https
			url, isURLRelative,
			"1.1",	// version
			headers,
			IHTTPSessionTypes.STANDARD,
			0, // delay
			isPrimary,
			null,// post data
			basicAuth,
			serverConnection,
			reqAction,
			"ISO-8859-1",
			"ISO-8859-1",
			"A1E9440FC22ABDE2DFEAE23864643438",
			true,
			false
		);
		
		req.setExpectedResponseCode(304);
		req.setConnectionClose(connectionClose);
		

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("https//");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}

	public HTTPAction request_73(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1E9440FC22ABE32DFEAE23864643438", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(8);
					
		headers.add(new RequestHeaderData("Host", "rptsvt-win21.nonprod.hclpnp.com:9443", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (X11; Linux x86_64; rv:65.0) Gecko/20100101 Firefox/65.0", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("Accept", "image/webp,*/*", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.5", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("Referer", "https://rptsvt-win21.nonprod.hclpnp.com:9443/PlantsByWebSphere/product.jsf", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("If-Modified-Since", "Mon, 16 Jan 2012 21:43:22 GMT", "ISO-8859-1", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_76 = new DataSub();
	reqAction.addDataSub(subContainer_76);

		ISubRule sub_313 = new SubRule("req_uri", 63, 6, true, (IDCCoreVar)dcVars[47], false, "ln", null, 0, false);
	subContainer_76.addSubInstruction(sub_313);
		ISubRule sub_314 = new SubRule("req_hdr_Host_1", 32, 4, false, (IDCCoreVar)vars[1], false, "Host_248", null, 0, false);
	subContainer_76.addSubInstruction(sub_314);
		ISubRule sub_315 = new SubRule("req_hdr_Referer_1", 0, 74, false, (IDCCoreVar)dcVars[43], false, "Referer_124", null, 0, false);
	subContainer_76.addSubInstruction(sub_315);
		ISubRule sub_316 = new SubRule("req_hdr_Host_1", 0, 31, false, (IDCCoreVar)vars[0], false, "Host_247", null, 0, false);
	subContainer_76.addSubInstruction(sub_316);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E9440FC2262A13DFEAE23864643438"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E9440FC2262A13DFEAE23864643438"), 3);		
		IConnectionRecord serverConnection = ConnectionRecordFactory.find(parent, 
				parallelGroup, connConfigName,
				true, // close connection at test boundary,
				null, 0, 1); // error behavior
		reqAction.io2=serverConnection.getHttp2ioConnector();
		IHTTPRequest req = new HTTPRequest(
			"GET",	// method
			"https",  // protocol - http or https
			url, isURLRelative,
			"1.1",	// version
			headers,
			IHTTPSessionTypes.STANDARD,
			0, // delay
			isPrimary,
			null,// post data
			basicAuth,
			serverConnection,
			reqAction,
			"ISO-8859-1",
			"ISO-8859-1",
			"A1E9440FC22ABE35DFEAE23864643438",
			true,
			false
		);
		
		req.setExpectedResponseCode(304);
		req.setConnectionClose(connectionClose);
		

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("https//");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}
private HTTPPage page_5(final IContainer parent) {
			HTTPThink think = new HTTPThink(1332, 1, parent, parent, "A1E9440FC2563AB7DFEAE23864643438");
	parent.add(think);
	
		HTTPPage page = new HTTPPage(parent, "Plants By WebSphere Login", "A1E9440FC2563AB7DFEAE23864643438") {
			
			public void execute() {   
				
	
	
	
	
			             
			{ // Parallal Block Start
				HTTPParallel httpParallel = new HTTPParallel(5, this);
				this.add(httpParallel);

				// httpParallel.addRequest(int serial, HTTPAction action, int actionDelay, String firstCharSemID) 
				httpParallel.addRequest(0, request_74(this, true, "A1E9440FC20D4AC0DFEAE23864643438", false, true,
						"Config_1", "rptsvt-win21.nonprod.hclpnp.com:9443/PlantsByWebSphere/cart.jsf",	"/PlantsByWebSphere/cart.jsf", true, false), 0, 100, "null", 3);
				httpParallel.addRequest(1, request_75(this, false, "A1E9440FC20CFCA0DFEAE23864643438", false, false,
						"Config_1", "rptsvt-win21.nonprod.hclpnp.com:9443/PlantsByWebSphere/javax.faces.resource/PlantMaster.css.jsf?ln=theme",	"/PlantsByWebSphere/javax.faces.resource/PlantMaster.css.jsf?ln=theme", true, false), 23, 100, "A1E9440FC2563ABBDFEAE23864643438", 2);
				httpParallel.addRequest(2, request_76(this, false, "A1E9440FC20C879CDFEAE23864643438", false, false,
						"Config_1", "rptsvt-win21.nonprod.hclpnp.com:9443/PlantsByWebSphere/javax.faces.resource/oamSubmit.js.jsf?ln=org.apache.myfaces",	"/PlantsByWebSphere/javax.faces.resource/oamSubmit.js.jsf?ln=org.apache.myfaces", true, false), 24, 100, "A1E9440FC2563ABBDFEAE23864643438", 2);
				httpParallel.addRequest(3, request_77(this, false, "A1E9440FC20E0E10DFEAE23864643438", true, false,
						"Config_1", "rptsvt-win21.nonprod.hclpnp.com:9443/PlantsByWebSphere/javax.faces.resource/button_sign_in.gif.jsf?ln=images",	"/PlantsByWebSphere/javax.faces.resource/button_sign_in.gif.jsf?ln=images", true, false), 26, 100, "A1E9440FC2563ABBDFEAE23864643438", 2);
				httpParallel.addRequest(4, request_78(this, false, "A1E9440FC20B9D10DFEAE23864643438", false, false,
						"Config_1", "rptsvt-win21.nonprod.hclpnp.com:9443/PlantsByWebSphere/javax.faces.resource/pbw.jpg.jsf?ln=images",	"/PlantsByWebSphere/javax.faces.resource/pbw.jpg.jsf?ln=images", true, false), 26, 100, "A1E9440FC2563ABBDFEAE23864643438", 2);
				httpParallel.addRequest(0, request_79(this, false, "A1E9440FC20D4AC0DFEAE23864643438", false, false,
						"Config_1", "rptsvt-win21.nonprod.hclpnp.com:9443/PlantsByWebSphere/javax.faces.resource/1x1_trans.gif.jsf?ln=images",	"/PlantsByWebSphere/javax.faces.resource/1x1_trans.gif.jsf?ln=images", true, false), 0, 100, "null", 3);
				httpParallel.addRequest(1, request_80(this, false, "A1E9440FC20CFCA0DFEAE23864643438", false, false,
						"Config_1", "rptsvt-win21.nonprod.hclpnp.com:9443/PlantsByWebSphere/javax.faces.resource/tab_flowers_u.gif.jsf?ln=images",	"/PlantsByWebSphere/javax.faces.resource/tab_flowers_u.gif.jsf?ln=images", true, false), 0, 100, "null", 3);
				httpParallel.addRequest(2, request_81(this, false, "A1E9440FC20C879CDFEAE23864643438", true, false,
						"Config_1", "rptsvt-win21.nonprod.hclpnp.com:9443/PlantsByWebSphere/javax.faces.resource/tab_veggies_u.gif.jsf?ln=images",	"/PlantsByWebSphere/javax.faces.resource/tab_veggies_u.gif.jsf?ln=images", true, false), 0, 100, "null", 3);
				httpParallel.addRequest(0, request_82(this, false, "A1E9440FC20D4AC0DFEAE23864643438", true, false,
						"Config_1", "rptsvt-win21.nonprod.hclpnp.com:9443/PlantsByWebSphere/javax.faces.resource/tab_trees_u.gif.jsf?ln=images",	"/PlantsByWebSphere/javax.faces.resource/tab_trees_u.gif.jsf?ln=images", true, false), 0, 100, "null", 3);
				httpParallel.addRequest(1, request_83(this, false, "A1E9440FC20CFCA0DFEAE23864643438", true, false,
						"Config_1", "rptsvt-win21.nonprod.hclpnp.com:9443/PlantsByWebSphere/javax.faces.resource/tab_accessories_u.gif.jsf?ln=images",	"/PlantsByWebSphere/javax.faces.resource/tab_accessories_u.gif.jsf?ln=images", true, false), 0, 100, "null", 3);
				httpParallel.addRequest(4, request_84(this, false, "A1E9440FC20B9D10DFEAE23864643438", true, false,
						"Config_1", "rptsvt-win21.nonprod.hclpnp.com:9443/PlantsByWebSphere/javax.faces.resource/poweredby_WebSphere.gif.jsf?ln=images",	"/PlantsByWebSphere/javax.faces.resource/poweredby_WebSphere.gif.jsf?ln=images", true, false), 0, 100, "null", 3);
			} // Parallal Block End 

			
				super.execute();
			}
		};
		
		
		page.setRemoveDelaysFromPageResponseTimes(false);
		page.setArmEnabled(false);  
		return page;
	}

	public HTTPAction request_74(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1E9440FC2563ABBDFEAE23864643438", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(10);
					
		headers.add(new RequestHeaderData("Host", "rptsvt-win21.nonprod.hclpnp.com:9443", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (X11; Linux x86_64; rv:65.0) Gecko/20100101 Firefox/65.0", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("Accept", "text/html,application/xhtml+xml,application/xml;q=0.9,image/webp,*/*;q=0.8", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.5", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("Referer", "https://rptsvt-win21.nonprod.hclpnp.com:9443/PlantsByWebSphere/product.jsf", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("Content-Type", "application/x-www-form-urlencoded", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("Content-Length", "300", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("Upgrade-Insecure-Requests", "1", "ISO-8859-1", 1));

				
			HTTPPostData postData = new HTTPPostData(reqAction, 0);
	
			postDataClass_4(postData);
				
		IBasicAuthentication basicAuth = null;
			IDataHarvester harvestContainer_5 = new DataHarvester();
	reqAction.addDataHarvester (harvestContainer_5);

	harvestContainer_5.addHarvestInstruction ("resp_hdr_Referer-RPT-Generated (read-only)_1", dcVars[48], ".*", 1, 0, 0, 0, false, "Referer-RPT-Generated (read-only)_11", null, 0, false);
	harvestContainer_5.addHarvestInstruction ("resp_content", dcVars[49], "\\?ln=(.*?)\"", 1, 1, 0, 0, false, "ln_154", null, 0, false);
	harvestContainer_5.addHarvestInstruction ("resp_content", dcVars[50], "\\?ln=(.*?)\"", 2, 1, 0, 0, false, "ln_152", null, 0, false);
	harvestContainer_5.addHarvestInstruction ("resp_content", dcVars[51], "\\?ln=(.*?)\"", 6, 4, 0, 0, false, "ln_153", null, 0, false);
	IDataSub subContainer_77 = new DataSub();
	reqAction.addDataSub(subContainer_77);

		ISubRule sub_317 = new SubRule("req_hdr_Host_1", 32, 4, false, (IDCCoreVar)vars[1], false, "Host_22", null, 0, false);
	subContainer_77.addSubInstruction(sub_317);
		ISubRule sub_318 = new SubRule("req_hdr_Host_1", 0, 31, false, (IDCCoreVar)vars[0], false, "Host_21", null, 0, false);
	subContainer_77.addSubInstruction(sub_318);
	


		
				
		IConnectionRecord serverConnection = ConnectionRecordFactory.find(parent, 
				parallelGroup, connConfigName,
				true, // close connection at test boundary,
				null, 0, 1); // error behavior
		reqAction.io2=serverConnection.getHttp2ioConnector();
		IHTTPRequest req = new HTTPRequest(
			"POST",	// method
			"https",  // protocol - http or https
			url, isURLRelative,
			"1.1",	// version
			headers,
			IHTTPSessionTypes.STANDARD,
			0, // delay
			isPrimary,
			postData,// post data
			basicAuth,
			serverConnection,
			reqAction,
			"ISO-8859-1",
			"ISO-8859-1",
			"A1E9440FC2563ABEDFEAE23864643438",
			true,
			false
		);
		
		req.setExpectedResponseCode(200);
		req.setConnectionClose(connectionClose);
		

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("text/html; charset=ISO-8859-1");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(true);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}
	private void postDataClass_4(HTTPPostData postData) {
				StringBuffer strBuf_4 = new StringBuffer();
strBuf_4.append("cart%3AcartTable%3A0%3Aquantity=1&cart%3AcartTable%3A1%3Aqua");
strBuf_4.append("ntity=1&cart%3AcartTable%3A2%3Aquantity=1&cart_SUBMIT=1&java");
strBuf_4.append("x.faces.ViewState=JOdHD0Nf8TsYahcFj50DfrpkzkvewAuNQNXTWRtgRZ");
strBuf_4.append("i1W6hd%2FpyfUgsiQa73GghT8Z7PpUb7nyUsseBpBjii1kBQFNSTwlm%2FiS");
strBuf_4.append("R3V%2FM2Broy5UlJ&cart%3A_idcl=cart%3Aj_id1147001700_73ca9618");
String requestData_4 = strBuf_4.toString();
			
	HTTPPostDataChunk pdc_3 = new HTTPPostDataChunk("A1E9440FC25661B6DFEAE23864643438", postData, requestData_4, "ISO-8859-1", 0, 0);
	postData.addDataChunk(pdc_3);

	}

	public HTTPAction request_75(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1E9440FC25688C0DFEAE23864643438", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(8);
					
		headers.add(new RequestHeaderData("Host", "rptsvt-win21.nonprod.hclpnp.com:9443", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (X11; Linux x86_64; rv:65.0) Gecko/20100101 Firefox/65.0", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("Accept", "text/css,*/*;q=0.1", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.5", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("Referer", "https://rptsvt-win21.nonprod.hclpnp.com:9443/PlantsByWebSphere/cart.jsf", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("If-Modified-Since", "Tue, 26 Feb 2019 20:52:28 GMT", "ISO-8859-1", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_78 = new DataSub();
	reqAction.addDataSub(subContainer_78);

		ISubRule sub_319 = new SubRule("req_uri", 63, 5, true, (IDCCoreVar)dcVars[49], false, "ln", null, 0, false);
	subContainer_78.addSubInstruction(sub_319);
		ISubRule sub_320 = new SubRule("req_hdr_Host_1", 32, 4, false, (IDCCoreVar)vars[1], false, "Host_20", null, 0, false);
	subContainer_78.addSubInstruction(sub_320);
		ISubRule sub_321 = new SubRule("req_hdr_Referer_1", 0, 71, false, (IDCCoreVar)dcVars[48], false, "Referer_10", null, 0, false);
	subContainer_78.addSubInstruction(sub_321);
		ISubRule sub_322 = new SubRule("req_hdr_Host_1", 0, 31, false, (IDCCoreVar)vars[0], false, "Host_19", null, 0, false);
	subContainer_78.addSubInstruction(sub_322);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E9440FC2563ABBDFEAE23864643438"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E9440FC2563ABBDFEAE23864643438"), 3);		
		IConnectionRecord serverConnection = ConnectionRecordFactory.find(parent, 
				parallelGroup, connConfigName,
				true, // close connection at test boundary,
				null, 0, 1); // error behavior
		reqAction.io2=serverConnection.getHttp2ioConnector();
		IHTTPRequest req = new HTTPRequest(
			"GET",	// method
			"https",  // protocol - http or https
			url, isURLRelative,
			"1.1",	// version
			headers,
			IHTTPSessionTypes.STANDARD,
			0, // delay
			isPrimary,
			null,// post data
			basicAuth,
			serverConnection,
			reqAction,
			"ISO-8859-1",
			"ISO-8859-1",
			"A1E9440FC25688C3DFEAE23864643438",
			true,
			false
		);
		
		req.setExpectedResponseCode(304);
		req.setConnectionClose(connectionClose);
		

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("https//");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}

	public HTTPAction request_76(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1E9440FC256AFD3DFEAE23864643438", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(8);
					
		headers.add(new RequestHeaderData("Host", "rptsvt-win21.nonprod.hclpnp.com:9443", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (X11; Linux x86_64; rv:65.0) Gecko/20100101 Firefox/65.0", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("Accept", "*/*", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.5", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("Referer", "https://rptsvt-win21.nonprod.hclpnp.com:9443/PlantsByWebSphere/cart.jsf", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("If-Modified-Since", "Tue, 26 Feb 2019 20:52:28 GMT", "ISO-8859-1", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_79 = new DataSub();
	reqAction.addDataSub(subContainer_79);

		ISubRule sub_323 = new SubRule("req_uri", 60, 18, true, (IDCCoreVar)dcVars[51], false, "ln", null, 0, false);
	subContainer_79.addSubInstruction(sub_323);
		ISubRule sub_324 = new SubRule("req_hdr_Host_1", 32, 4, false, (IDCCoreVar)vars[1], false, "Host_18", null, 0, false);
	subContainer_79.addSubInstruction(sub_324);
		ISubRule sub_325 = new SubRule("req_hdr_Referer_1", 0, 71, false, (IDCCoreVar)dcVars[48], false, "Referer_9", null, 0, false);
	subContainer_79.addSubInstruction(sub_325);
		ISubRule sub_326 = new SubRule("req_hdr_Host_1", 0, 31, false, (IDCCoreVar)vars[0], false, "Host_17", null, 0, false);
	subContainer_79.addSubInstruction(sub_326);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E9440FC2563ABBDFEAE23864643438"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E9440FC2563ABBDFEAE23864643438"), 3);		
		IConnectionRecord serverConnection = ConnectionRecordFactory.find(parent, 
				parallelGroup, connConfigName,
				true, // close connection at test boundary,
				null, 0, 1); // error behavior
		reqAction.io2=serverConnection.getHttp2ioConnector();
		IHTTPRequest req = new HTTPRequest(
			"GET",	// method
			"https",  // protocol - http or https
			url, isURLRelative,
			"1.1",	// version
			headers,
			IHTTPSessionTypes.STANDARD,
			0, // delay
			isPrimary,
			null,// post data
			basicAuth,
			serverConnection,
			reqAction,
			"ISO-8859-1",
			"ISO-8859-1",
			"A1E9440FC256AFD6DFEAE23864643438",
			true,
			false
		);
		
		req.setExpectedResponseCode(304);
		req.setConnectionClose(connectionClose);
		

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("https//");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}

	public HTTPAction request_77(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1E9440FC256D713DFEAE23864643438", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(8);
					
		headers.add(new RequestHeaderData("Host", "rptsvt-win21.nonprod.hclpnp.com:9443", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (X11; Linux x86_64; rv:65.0) Gecko/20100101 Firefox/65.0", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("Accept", "image/webp,*/*", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.5", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("Referer", "https://rptsvt-win21.nonprod.hclpnp.com:9443/PlantsByWebSphere/cart.jsf", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("If-Modified-Since", "Mon, 16 Jan 2012 21:43:20 GMT", "ISO-8859-1", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_80 = new DataSub();
	reqAction.addDataSub(subContainer_80);

		ISubRule sub_327 = new SubRule("req_uri", 66, 6, true, (IDCCoreVar)dcVars[50], false, "ln", null, 0, false);
	subContainer_80.addSubInstruction(sub_327);
		ISubRule sub_328 = new SubRule("req_hdr_Host_1", 32, 4, false, (IDCCoreVar)vars[1], false, "Host_16", null, 0, false);
	subContainer_80.addSubInstruction(sub_328);
		ISubRule sub_329 = new SubRule("req_hdr_Referer_1", 0, 71, false, (IDCCoreVar)dcVars[48], false, "Referer_8", null, 0, false);
	subContainer_80.addSubInstruction(sub_329);
		ISubRule sub_330 = new SubRule("req_hdr_Host_1", 0, 31, false, (IDCCoreVar)vars[0], false, "Host_15", null, 0, false);
	subContainer_80.addSubInstruction(sub_330);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E9440FC2563ABBDFEAE23864643438"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E9440FC2563ABBDFEAE23864643438"), 3);		
		IConnectionRecord serverConnection = ConnectionRecordFactory.find(parent, 
				parallelGroup, connConfigName,
				true, // close connection at test boundary,
				null, 0, 1); // error behavior
		reqAction.io2=serverConnection.getHttp2ioConnector();
		IHTTPRequest req = new HTTPRequest(
			"GET",	// method
			"https",  // protocol - http or https
			url, isURLRelative,
			"1.1",	// version
			headers,
			IHTTPSessionTypes.STANDARD,
			0, // delay
			isPrimary,
			null,// post data
			basicAuth,
			serverConnection,
			reqAction,
			"ISO-8859-1",
			"ISO-8859-1",
			"A1E9440FC256D716DFEAE23864643438",
			true,
			false
		);
		
		req.setExpectedResponseCode(304);
		req.setConnectionClose(connectionClose);
		

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("https//");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}

	public HTTPAction request_78(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1E9440FC256FE11DFEAE23864643438", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(8);
					
		headers.add(new RequestHeaderData("Host", "rptsvt-win21.nonprod.hclpnp.com:9443", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (X11; Linux x86_64; rv:65.0) Gecko/20100101 Firefox/65.0", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("Accept", "image/webp,*/*", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.5", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("Referer", "https://rptsvt-win21.nonprod.hclpnp.com:9443/PlantsByWebSphere/cart.jsf", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("If-Modified-Since", "Mon, 16 Jan 2012 21:43:22 GMT", "ISO-8859-1", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_81 = new DataSub();
	reqAction.addDataSub(subContainer_81);

		ISubRule sub_331 = new SubRule("req_uri", 55, 6, true, (IDCCoreVar)dcVars[50], false, "ln", null, 0, false);
	subContainer_81.addSubInstruction(sub_331);
		ISubRule sub_332 = new SubRule("req_hdr_Host_1", 32, 4, false, (IDCCoreVar)vars[1], false, "Host_14", null, 0, false);
	subContainer_81.addSubInstruction(sub_332);
		ISubRule sub_333 = new SubRule("req_hdr_Referer_1", 0, 71, false, (IDCCoreVar)dcVars[48], false, "Referer_7", null, 0, false);
	subContainer_81.addSubInstruction(sub_333);
		ISubRule sub_334 = new SubRule("req_hdr_Host_1", 0, 31, false, (IDCCoreVar)vars[0], false, "Host_13", null, 0, false);
	subContainer_81.addSubInstruction(sub_334);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E9440FC2563ABBDFEAE23864643438"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E9440FC2563ABBDFEAE23864643438"), 3);		
		IConnectionRecord serverConnection = ConnectionRecordFactory.find(parent, 
				parallelGroup, connConfigName,
				true, // close connection at test boundary,
				null, 0, 1); // error behavior
		reqAction.io2=serverConnection.getHttp2ioConnector();
		IHTTPRequest req = new HTTPRequest(
			"GET",	// method
			"https",  // protocol - http or https
			url, isURLRelative,
			"1.1",	// version
			headers,
			IHTTPSessionTypes.STANDARD,
			0, // delay
			isPrimary,
			null,// post data
			basicAuth,
			serverConnection,
			reqAction,
			"ISO-8859-1",
			"ISO-8859-1",
			"A1E9440FC256FE14DFEAE23864643438",
			true,
			false
		);
		
		req.setExpectedResponseCode(304);
		req.setConnectionClose(connectionClose);
		

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("https//");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}

	public HTTPAction request_79(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1E9440FC2572520DFEAE23864643438", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(8);
					
		headers.add(new RequestHeaderData("Host", "rptsvt-win21.nonprod.hclpnp.com:9443", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (X11; Linux x86_64; rv:65.0) Gecko/20100101 Firefox/65.0", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("Accept", "image/webp,*/*", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.5", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("Referer", "https://rptsvt-win21.nonprod.hclpnp.com:9443/PlantsByWebSphere/cart.jsf", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("If-Modified-Since", "Mon, 16 Jan 2012 21:43:22 GMT", "ISO-8859-1", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_82 = new DataSub();
	reqAction.addDataSub(subContainer_82);

		ISubRule sub_335 = new SubRule("req_uri", 61, 6, true, (IDCCoreVar)dcVars[50], false, "ln", null, 0, false);
	subContainer_82.addSubInstruction(sub_335);
		ISubRule sub_336 = new SubRule("req_hdr_Host_1", 32, 4, false, (IDCCoreVar)vars[1], false, "Host_12", null, 0, false);
	subContainer_82.addSubInstruction(sub_336);
		ISubRule sub_337 = new SubRule("req_hdr_Referer_1", 0, 71, false, (IDCCoreVar)dcVars[48], false, "Referer_6", null, 0, false);
	subContainer_82.addSubInstruction(sub_337);
		ISubRule sub_338 = new SubRule("req_hdr_Host_1", 0, 31, false, (IDCCoreVar)vars[0], false, "Host_11", null, 0, false);
	subContainer_82.addSubInstruction(sub_338);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E9440FC2563ABBDFEAE23864643438"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E9440FC2563ABBDFEAE23864643438"), 3);		
		IConnectionRecord serverConnection = ConnectionRecordFactory.find(parent, 
				parallelGroup, connConfigName,
				true, // close connection at test boundary,
				null, 0, 1); // error behavior
		reqAction.io2=serverConnection.getHttp2ioConnector();
		IHTTPRequest req = new HTTPRequest(
			"GET",	// method
			"https",  // protocol - http or https
			url, isURLRelative,
			"1.1",	// version
			headers,
			IHTTPSessionTypes.STANDARD,
			0, // delay
			isPrimary,
			null,// post data
			basicAuth,
			serverConnection,
			reqAction,
			"ISO-8859-1",
			"ISO-8859-1",
			"A1E9440FC2572523DFEAE23864643438",
			true,
			false
		);
		
		req.setExpectedResponseCode(304);
		req.setConnectionClose(connectionClose);
		

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("https//");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}

	public HTTPAction request_80(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1E9440FC2574C13DFEAE23864643438", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(8);
					
		headers.add(new RequestHeaderData("Host", "rptsvt-win21.nonprod.hclpnp.com:9443", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (X11; Linux x86_64; rv:65.0) Gecko/20100101 Firefox/65.0", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("Accept", "image/webp,*/*", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.5", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("Referer", "https://rptsvt-win21.nonprod.hclpnp.com:9443/PlantsByWebSphere/cart.jsf", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("If-Modified-Since", "Mon, 16 Jan 2012 21:43:20 GMT", "ISO-8859-1", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_83 = new DataSub();
	reqAction.addDataSub(subContainer_83);

		ISubRule sub_339 = new SubRule("req_uri", 65, 6, true, (IDCCoreVar)dcVars[50], false, "ln", null, 0, false);
	subContainer_83.addSubInstruction(sub_339);
		ISubRule sub_340 = new SubRule("req_hdr_Host_1", 32, 4, false, (IDCCoreVar)vars[1], false, "Host_10", null, 0, false);
	subContainer_83.addSubInstruction(sub_340);
		ISubRule sub_341 = new SubRule("req_hdr_Referer_1", 0, 71, false, (IDCCoreVar)dcVars[48], false, "Referer_5", null, 0, false);
	subContainer_83.addSubInstruction(sub_341);
		ISubRule sub_342 = new SubRule("req_hdr_Host_1", 0, 31, false, (IDCCoreVar)vars[0], false, "Host_9", null, 0, false);
	subContainer_83.addSubInstruction(sub_342);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E9440FC2563ABBDFEAE23864643438"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E9440FC2563ABBDFEAE23864643438"), 3);		
		IConnectionRecord serverConnection = ConnectionRecordFactory.find(parent, 
				parallelGroup, connConfigName,
				true, // close connection at test boundary,
				null, 0, 1); // error behavior
		reqAction.io2=serverConnection.getHttp2ioConnector();
		IHTTPRequest req = new HTTPRequest(
			"GET",	// method
			"https",  // protocol - http or https
			url, isURLRelative,
			"1.1",	// version
			headers,
			IHTTPSessionTypes.STANDARD,
			0, // delay
			isPrimary,
			null,// post data
			basicAuth,
			serverConnection,
			reqAction,
			"ISO-8859-1",
			"ISO-8859-1",
			"A1E9440FC2574C16DFEAE23864643438",
			true,
			false
		);
		
		req.setExpectedResponseCode(304);
		req.setConnectionClose(connectionClose);
		

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("https//");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}

	public HTTPAction request_81(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1E9440FC2574C66DFEAE23864643438", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(8);
					
		headers.add(new RequestHeaderData("Host", "rptsvt-win21.nonprod.hclpnp.com:9443", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (X11; Linux x86_64; rv:65.0) Gecko/20100101 Firefox/65.0", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("Accept", "image/webp,*/*", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.5", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("Referer", "https://rptsvt-win21.nonprod.hclpnp.com:9443/PlantsByWebSphere/cart.jsf", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("If-Modified-Since", "Mon, 16 Jan 2012 21:43:22 GMT", "ISO-8859-1", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_84 = new DataSub();
	reqAction.addDataSub(subContainer_84);

		ISubRule sub_343 = new SubRule("req_uri", 65, 6, true, (IDCCoreVar)dcVars[50], false, "ln", null, 0, false);
	subContainer_84.addSubInstruction(sub_343);
		ISubRule sub_344 = new SubRule("req_hdr_Host_1", 32, 4, false, (IDCCoreVar)vars[1], false, "Host_8", null, 0, false);
	subContainer_84.addSubInstruction(sub_344);
		ISubRule sub_345 = new SubRule("req_hdr_Referer_1", 0, 71, false, (IDCCoreVar)dcVars[48], false, "Referer_4", null, 0, false);
	subContainer_84.addSubInstruction(sub_345);
		ISubRule sub_346 = new SubRule("req_hdr_Host_1", 0, 31, false, (IDCCoreVar)vars[0], false, "Host_7", null, 0, false);
	subContainer_84.addSubInstruction(sub_346);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E9440FC2563ABBDFEAE23864643438"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E9440FC2563ABBDFEAE23864643438"), 3);		
		IConnectionRecord serverConnection = ConnectionRecordFactory.find(parent, 
				parallelGroup, connConfigName,
				true, // close connection at test boundary,
				null, 0, 1); // error behavior
		reqAction.io2=serverConnection.getHttp2ioConnector();
		IHTTPRequest req = new HTTPRequest(
			"GET",	// method
			"https",  // protocol - http or https
			url, isURLRelative,
			"1.1",	// version
			headers,
			IHTTPSessionTypes.STANDARD,
			0, // delay
			isPrimary,
			null,// post data
			basicAuth,
			serverConnection,
			reqAction,
			"ISO-8859-1",
			"ISO-8859-1",
			"A1E9440FC2574C69DFEAE23864643438",
			true,
			false
		);
		
		req.setExpectedResponseCode(304);
		req.setConnectionClose(connectionClose);
		

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("https//");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}

	public HTTPAction request_82(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1E9440FC257733BDFEAE23864643438", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(8);
					
		headers.add(new RequestHeaderData("Host", "rptsvt-win21.nonprod.hclpnp.com:9443", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (X11; Linux x86_64; rv:65.0) Gecko/20100101 Firefox/65.0", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("Accept", "image/webp,*/*", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.5", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("Referer", "https://rptsvt-win21.nonprod.hclpnp.com:9443/PlantsByWebSphere/cart.jsf", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("If-Modified-Since", "Mon, 16 Jan 2012 21:43:22 GMT", "ISO-8859-1", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_85 = new DataSub();
	reqAction.addDataSub(subContainer_85);

		ISubRule sub_347 = new SubRule("req_uri", 63, 6, true, (IDCCoreVar)dcVars[50], false, "ln", null, 0, false);
	subContainer_85.addSubInstruction(sub_347);
		ISubRule sub_348 = new SubRule("req_hdr_Host_1", 32, 4, false, (IDCCoreVar)vars[1], false, "Host_6", null, 0, false);
	subContainer_85.addSubInstruction(sub_348);
		ISubRule sub_349 = new SubRule("req_hdr_Referer_1", 0, 71, false, (IDCCoreVar)dcVars[48], false, "Referer_3", null, 0, false);
	subContainer_85.addSubInstruction(sub_349);
		ISubRule sub_350 = new SubRule("req_hdr_Host_1", 0, 31, false, (IDCCoreVar)vars[0], false, "Host_5", null, 0, false);
	subContainer_85.addSubInstruction(sub_350);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E9440FC2563ABBDFEAE23864643438"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E9440FC2563ABBDFEAE23864643438"), 3);		
		IConnectionRecord serverConnection = ConnectionRecordFactory.find(parent, 
				parallelGroup, connConfigName,
				true, // close connection at test boundary,
				null, 0, 1); // error behavior
		reqAction.io2=serverConnection.getHttp2ioConnector();
		IHTTPRequest req = new HTTPRequest(
			"GET",	// method
			"https",  // protocol - http or https
			url, isURLRelative,
			"1.1",	// version
			headers,
			IHTTPSessionTypes.STANDARD,
			0, // delay
			isPrimary,
			null,// post data
			basicAuth,
			serverConnection,
			reqAction,
			"ISO-8859-1",
			"ISO-8859-1",
			"A1E9440FC257733EDFEAE23864643438",
			true,
			false
		);
		
		req.setExpectedResponseCode(304);
		req.setConnectionClose(connectionClose);
		

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("https//");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}

	public HTTPAction request_83(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1E9440FC2579A32DFEAE23864643438", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(8);
					
		headers.add(new RequestHeaderData("Host", "rptsvt-win21.nonprod.hclpnp.com:9443", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (X11; Linux x86_64; rv:65.0) Gecko/20100101 Firefox/65.0", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("Accept", "image/webp,*/*", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.5", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("Referer", "https://rptsvt-win21.nonprod.hclpnp.com:9443/PlantsByWebSphere/cart.jsf", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("If-Modified-Since", "Mon, 16 Jan 2012 21:43:20 GMT", "ISO-8859-1", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_86 = new DataSub();
	reqAction.addDataSub(subContainer_86);

		ISubRule sub_351 = new SubRule("req_uri", 69, 6, true, (IDCCoreVar)dcVars[50], false, "ln", null, 0, false);
	subContainer_86.addSubInstruction(sub_351);
		ISubRule sub_352 = new SubRule("req_hdr_Host_1", 32, 4, false, (IDCCoreVar)vars[1], false, "Host_4", null, 0, false);
	subContainer_86.addSubInstruction(sub_352);
		ISubRule sub_353 = new SubRule("req_hdr_Referer_1", 0, 71, false, (IDCCoreVar)dcVars[48], false, "Referer_2", null, 0, false);
	subContainer_86.addSubInstruction(sub_353);
		ISubRule sub_354 = new SubRule("req_hdr_Host_1", 0, 31, false, (IDCCoreVar)vars[0], false, "Host_3", null, 0, false);
	subContainer_86.addSubInstruction(sub_354);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E9440FC2563ABBDFEAE23864643438"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E9440FC2563ABBDFEAE23864643438"), 3);		
		IConnectionRecord serverConnection = ConnectionRecordFactory.find(parent, 
				parallelGroup, connConfigName,
				true, // close connection at test boundary,
				null, 0, 1); // error behavior
		reqAction.io2=serverConnection.getHttp2ioConnector();
		IHTTPRequest req = new HTTPRequest(
			"GET",	// method
			"https",  // protocol - http or https
			url, isURLRelative,
			"1.1",	// version
			headers,
			IHTTPSessionTypes.STANDARD,
			0, // delay
			isPrimary,
			null,// post data
			basicAuth,
			serverConnection,
			reqAction,
			"ISO-8859-1",
			"ISO-8859-1",
			"A1E9440FC2579A35DFEAE23864643438",
			true,
			false
		);
		
		req.setExpectedResponseCode(304);
		req.setConnectionClose(connectionClose);
		

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("https//");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}

	public HTTPAction request_84(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1E9440FC257C140DFEAE23864643438", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(8);
					
		headers.add(new RequestHeaderData("Host", "rptsvt-win21.nonprod.hclpnp.com:9443", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (X11; Linux x86_64; rv:65.0) Gecko/20100101 Firefox/65.0", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("Accept", "image/webp,*/*", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.5", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("Referer", "https://rptsvt-win21.nonprod.hclpnp.com:9443/PlantsByWebSphere/cart.jsf", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("If-Modified-Since", "Mon, 16 Jan 2012 21:43:22 GMT", "ISO-8859-1", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_87 = new DataSub();
	reqAction.addDataSub(subContainer_87);

		ISubRule sub_355 = new SubRule("req_uri", 71, 6, true, (IDCCoreVar)dcVars[50], false, "ln", null, 0, false);
	subContainer_87.addSubInstruction(sub_355);
		ISubRule sub_356 = new SubRule("req_hdr_Host_1", 32, 4, false, (IDCCoreVar)vars[1], false, "Host_2", null, 0, false);
	subContainer_87.addSubInstruction(sub_356);
		ISubRule sub_357 = new SubRule("req_hdr_Referer_1", 0, 71, false, (IDCCoreVar)dcVars[48], false, "Referer", null, 0, false);
	subContainer_87.addSubInstruction(sub_357);
		ISubRule sub_358 = new SubRule("req_hdr_Host_1", 0, 31, false, (IDCCoreVar)vars[0], false, "Host", null, 0, false);
	subContainer_87.addSubInstruction(sub_358);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E9440FC2563ABBDFEAE23864643438"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E9440FC2563ABBDFEAE23864643438"), 3);		
		IConnectionRecord serverConnection = ConnectionRecordFactory.find(parent, 
				parallelGroup, connConfigName,
				true, // close connection at test boundary,
				null, 0, 1); // error behavior
		reqAction.io2=serverConnection.getHttp2ioConnector();
		IHTTPRequest req = new HTTPRequest(
			"GET",	// method
			"https",  // protocol - http or https
			url, isURLRelative,
			"1.1",	// version
			headers,
			IHTTPSessionTypes.STANDARD,
			0, // delay
			isPrimary,
			null,// post data
			basicAuth,
			serverConnection,
			reqAction,
			"ISO-8859-1",
			"ISO-8859-1",
			"A1E9440FC257C143DFEAE23864643438",
			true,
			false
		);
		
		req.setExpectedResponseCode(304);
		req.setConnectionClose(connectionClose);
		

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("https//");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}
}
