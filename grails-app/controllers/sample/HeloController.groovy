package sample

class HeloController {

    def index() {
    	//render "<html><body><h1>Helo</h1><p>welcome to Grails!</p></body></html>"
    //	[
    //	'title':"Sample Page",
    //    'msg':"This is sample page",
    //    'date':Calendar.getInstance().getTime()
    // 	]

    def arr = [
            'title':"Sample Page",
            'msg':"What's your name?",
            'value':''
        ];
        if (params['input'] != null){
            arr['value'] = params['input'];
            arr['msg'] = 'Hello ' + params['input'] + '！'
        }
        arr;
    
    }
}
