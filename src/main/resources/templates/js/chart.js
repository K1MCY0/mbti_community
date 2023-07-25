var chartDataLabelsOptions = {
    plugins: {
        responsive: false,
        maintainAspectRatio: false,
        datalabels: {
            font: { size: 18, weight: 'bold' },
            color: 'gray',
            formatter: function(value, context) {
                return context.dataIndex + Math.round(value) + '%';
            },
        }
    }
};

var ctx1 = document.getElementById('chart1').getContext('2d');
new Chart(ctx1, {
    plugins: [ChartDataLabels],
    type: 'bar',
    data: {
        labels: ['ENFP', 'ENTP', 'INFP', 'INTP', 'ENTJ', 'ESTJ', 'INTJ', 'ISTJ', 'ENFJ', 'INFJ', 'ISFJ', 'ESFJ', 'ISTP', 'ESFP', 'ISFP', 'ESTP'],
        datasets: [{
            data: [133, 122, 112, 100, 91, 89, 86, 84, 75, 69, 65, 59, 56, 48, 47, 45],
            backgroundColor: [
                'rgba(204,102,102,0.2)', 'rgba(102,153,153,0.2)', 'rgba(255,153,153,0.2)', 'rgba(102,204,204,0.2)',
                'rgba(153,204,204,0.2)', 'rgba(51,153,102,0.2)', 'rgba(153,255,255,0.2)', 'rgba(102,204,153,0.2)',
                'rgba(204,153,153,0.2)', 'rgba(255,204,204,0.2)', 'rgba(51,204,153,0.2)', 'rgba(102,255,204,0.2)',
                'rgba(204,153,51,0.2)', 'rgba(204,153,102,0.2)', 'rgba(255,204,102,0.2)', 'rgba(255,204,153,0.2)',
            ],
            borderColor: [
                'rgba(204,102,102,1)', 'rgba(102,153,153,1)', 'rgba(255,153,153,1)', 'rgba(102,204,204,1)',
                'rgba(153,204,204,1)', 'rgba(51,153,102,1)', 'rgba(153,255,255,1)', 'rgba(102,204,153,1)',
                'rgba(204,153,153,1)', 'rgba(255,204,204,1)', 'rgba(51,204,153,1)', 'rgba(102,255,204,1)',
                'rgba(204,153,51,1)', 'rgba(204,153,102,1)', 'rgba(255,204,102,1)', 'rgba(255,204,153,1)',
            ],
            borderWidth: 1
        }]
    },
    options: {
        plugins: { legend: { display: false } }
    }
});



var ctx2 = document.getElementById('chart2').getContext('2d');
new Chart(ctx2, {
    plugins: [ChartDataLabels],
    type: 'pie',
    data: {
        labels: ['E', 'I'],
        datasets: [{
            data: [51, 48],
            backgroundColor: ['rgba(137,207,240,0.2)', 'rgba(188,212,230,0.2)'],
            borderColor: ['rgba(137,207,240,0.5)', 'rgba(188,212,230,0.5)'],
            borderWidth: 3,
        }]
    },
    options: chartDataLabelsOptions
});


var ctx3 = document.getElementById('chart3').getContext('2d');
new Chart(ctx3, {
    plugins: [ChartDataLabels],
    type: 'pie',
    data: {
        labels: ['N', 'S'],
        datasets: [{
            data: [61, 38],
            backgroundColor: ['rgba(255,255,102,0.2)', 'rgba(255,255,153,0.2)'],
            borderColor: ['rgba(255,255,102,0.5)', 'rgba(255,255,153,0.5)'],
            borderWidth: 3,
        }]
    },
    options: chartDataLabelsOptions
});


var ctx4 = document.getElementById('chart4').getContext('2d');
new Chart(ctx4, {
    plugins: [ChartDataLabels],
    type: 'pie',
    data: {
        labels: ['T', 'F'],
        datasets: [{
            data: [52, 47],
            backgroundColor: ['rgba(102,204,153,0.2)', 'rgba(153,255,204,0.2)'],
            borderColor: ['rgba(102,204,153,0.5)', 'rgba(153,255,204,0.5)'],
            borderWidth: 3,
        }]
    },
    options: chartDataLabelsOptions
});

var ctx5 = document.getElementById('chart5').getContext('2d');
new Chart(ctx5, {
    plugins: [ChartDataLabels],
    type: 'pie',
    data: {
        labels: ['P', 'J'],
        datasets: [{
            data: [51, 48],
            backgroundColor: ['rgba(255,153,051,0.2)', 'rgba(255,153,102,0.2)'],
            borderColor: ['rgba(255,153,051,0.5)', 'rgba(255,153,102,0.5)'],
            borderWidth: 3,
        }]
    },
    options: chartDataLabelsOptions
});