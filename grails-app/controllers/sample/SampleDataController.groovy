package sample

class SampleDataController {

     def index = {
        def arr = SampleData.all;
        render arr;
    }
}
