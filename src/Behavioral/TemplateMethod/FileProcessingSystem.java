package Behavioral.TemplateMethod;

abstract class FileProcessor{

    public void process(){
        parseFile();
        getName();
        getJob();
    }

    protected abstract void parseFile();
    protected abstract void getName();
    protected abstract void getJob();
}

class CSVProcessor extends FileProcessor{
    @Override
    protected void parseFile() {

    }

    @Override
    protected void getName() {

    }

    @Override
    protected void getJob() {

    }
}

class JSONProcessor extends FileProcessor{
    @Override
    protected void parseFile() {

    }

    @Override
    protected void getName() {

    }

    @Override
    protected void getJob() {

    }
}