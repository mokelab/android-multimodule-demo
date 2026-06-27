package com.mokelab.demo.multimodule.screen

import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import com.mokelab.demo.multimodule.repository.Data591RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data592RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data593RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data594RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data595RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data596RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data597RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data598RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data599RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data600RepositoryImpl 

import javax.inject.Inject

@HiltViewModel
class Screen060ViewModel @Inject constructor(
    private val repo1: Data591RepositoryImpl,
    private val repo2: Data592RepositoryImpl,
    private val repo3: Data593RepositoryImpl,
    private val repo4: Data594RepositoryImpl,
    private val repo5: Data595RepositoryImpl,
    private val repo6: Data596RepositoryImpl,
    private val repo7: Data597RepositoryImpl,
    private val repo8: Data598RepositoryImpl,
    private val repo9: Data599RepositoryImpl,
    private val repo10: Data600RepositoryImpl,

): ViewModel() {
}
