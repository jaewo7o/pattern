var TestClass01 = function() {
	this.val = 'Class01';
};

TestClass01.prototype.print = function() {
	console.log(this.val);
};

var TestClass02 = function() {
	this.val = 'Class02';
};

TestClass02.prototype.print = function() {
	console.log(this.val);
};

var TestClassFactory = function() {
	this.TestClass01 = TestClass01;
	this.TestClass02 = TestClass02;
};

TestClassFactory.prototype.testClassFactory = function(classname, args) {
	return new this[classname](args);
};

window.TestClassFactory = new TestClassFactory();
var test01 = TestClassFactory.testClassFactory('TestClass01');
var test02 = TestClassFactory.testClassFactory('TestClass02');